package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 11720번
    // 숫자의 합

    // 입력
    // 5
    // 54321

    // 출력
    // 15
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val inputs = sc.next()
    sc.close()

    var result = 0
    for (i in 0 until n) {
        result += inputs[i] - '0'
    }
    println(result)
}