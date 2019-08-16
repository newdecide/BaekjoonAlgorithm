package kotlinalgo.k013_DinamicProgramming

import java.util.*

// 11727번
// 2xn 타이링2
// 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
//아래 그림은 2×17 직사각형을 채운 한가지 예이다.

var d: IntArray? = null
// BOTTOM-UP
fun bottomUp(n: Int): Int {
    d!![0] = 1
    if (n > 0) d!![1] = 1
    for (i in 2..n) {
        d!![i] = 2 * d!![i - 2] + d!![i - 1]
        d!![i] %= 10007
    }
    return d!![n]
}

// TOP-DOWN
fun topDown(n: Int): Int {
    if (n == 0 || n == 1) return 1
    if (d!![n] > 0) return d!![n]

    d!![n] = 2 * topDown(n - 2) + topDown(n - 1)
    d!![n] %= 10007

    return d!![n]
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    try {
        val n = Integer.parseInt(sc.nextLine())
        d = IntArray(n + 1)
        topDown(n)
        print(d!![n])
        sc.close()
    } catch (e: Exception) {
        // TODO: handle exception
        e.printStackTrace()
    }

}