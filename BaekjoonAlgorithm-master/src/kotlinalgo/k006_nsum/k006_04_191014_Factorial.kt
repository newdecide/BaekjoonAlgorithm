package kotlinalgo.k006_nsum

import java.util.*

// 10872번 팩토리얼
fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    var res = 1

    for (i in a downTo 1) {
        res *= i
    }
    println(res)

}