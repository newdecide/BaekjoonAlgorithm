package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 1330번
    // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
    val sc = Scanner(System.`in`)

    val A = sc.nextInt()
    val B = sc.nextInt()

    if (A > B)
        println(">")
    else if (A < B)
        println("<")
    else
        println("==")
}