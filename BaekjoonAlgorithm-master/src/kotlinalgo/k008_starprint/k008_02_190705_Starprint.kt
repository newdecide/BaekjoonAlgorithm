import java.util.*

fun main(args: Array<String>) {
    // 2439번
    // 별 찍기-2
    // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    //     *
    //    **
    //   ***
    //  ****
    // *****
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    if(1 <= n && n <= 100){
        for(i in 0 until n){
            for(j in 0..n-i){
                print(" ")
            }
            for(k in 0..i){
                print("*")
            }
            println()
        }
    }
}