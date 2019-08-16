import java.util.*

fun main(args: Array<String>) {
    // 2440번
    // 별 찍기-3
    // 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
    // *****
    // ****
    // ***
    // **
    // *

    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    if (1 <= n && n <= 100) {
        for(i in 0 until n){
            for(j in n-i downTo 1){
                print("*")
            }
            println()
        }
    }
}