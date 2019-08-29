package kotlinalgo.k001_add

import java.util.*

fun main(args: Array<String>) {
    // 11869번
    // 사칙연산
    // 1 10
    // 11
    // -9
    // 10
    // 0
    // 1
        val scan = Scanner(System.`in`)
        val num1 = scan.nextInt()
        val num2 = scan.nextInt()

        println(num1 + num2)
        println(num1 - num2)
        println(num1 * num2)
        println(num1 / num2)
        println(num1 % num2)
}