import java.util.Scanner

// 9085번
// 10보다 작거나 같은 자연수 N개를 주면 합을 구하는 프로그램을 작성하시오.
// 2
// 5
// 1 1 1 1 1
// 7
// 1 2 3 4 5 6 7
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val tries: Int
    tries = sc.nextInt()
    for (i in 0 until tries) {
        val a = sc.nextInt()
        var sum = 0
        for (j in 0 until a) {
            sum += sc.nextInt()
        }
        println(sum)
    }
}

