import java.util.*

fun main(args: Array<String>) {
    // 2438번
    // 별 찍기-1
    // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    // *
    // **
    // ***
    // ****
    // *****
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    for(i in 1..n){
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}