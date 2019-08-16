import java.util.*

fun main(args: Array<String>) {
    // 2442번
    // 별 찍기-5
    // 첫째 줄에 별 1개, 둘째 줄에 별 3개, ... N번째 줄에 별 2*N-1개 찍기
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    if (1 <= n && n <= 100) {
        for (i in 0 until n) {
            for (j in 0 until n - i - 1) {
                print(" ")
            }
            for (k in 0 until 2 * i + 1) {
                print("*")
            }
            println()
        }
    }
}