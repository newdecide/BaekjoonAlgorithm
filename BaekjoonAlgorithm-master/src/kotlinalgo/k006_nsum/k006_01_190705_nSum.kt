import java.util.*

fun main(args: Array<String>) {
    // 8393번
    // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()
    var sum = 0
    for (i in 1..n){
        sum += i
    }
    println(sum)
}