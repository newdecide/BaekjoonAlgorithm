package kotlinalgo.k014_input

import java.util.*

internal var t: Int = 0
internal var n: Int = 0
internal var a: String = ""

fun main(args: Array<String>) {
    // 2675번
    // 문자열 반복
    // 입력
    // 2
    // 3 ABC
    // 5 /HTP
    // 출력
    // AAABBBCCC
    // /////HHHHHTTTTTPPPPP


    val `in` = Scanner(System.`in`)
    t = `in`.nextInt()
    for (tc in 0 until t) {
        n = `in`.nextInt()
        a = `in`.next()
        for (i in 0 until a.length)
            for (j in 0 until n)
                print(a[i])
        println()
    }
    `in`.close()
}