package kotlinalgo.k013_DinamicProgramming

import java.util.*

fun main(args: Array<String>) {
    // 9465번
    // 스티커 문제
        val sc = Scanner(System.`in`)
        val tc = sc.nextInt()

        for (t in 0 until tc) {
            val n = sc.nextInt()
            val a = Array(2) { IntArray(n + 1) }
            val dp = Array(n + 1) { IntArray(3) }

            for (i in 0..1)
                for (j in 1..n)
                    a[i][j] = sc.nextInt()

            dp[1][0] = 0 //X X
            dp[1][1] = a[0][1] //O X
            dp[1][2] = a[1][1] //X O

            for (i in 2..n) {
                dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]))
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + a[0][i]
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + a[1][i]
            }

            println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])))

        }
        sc.close()

    // 입력
    // 2
    // 5
    // 50 10 100 20 40
    // 30 50 70 10 60
    // 출력
    // 260
    // 입력
    // 7
    // 10 30 10 50 100 20 40
    // 20 40 30 50 60 20 80
    // 출력
    // 290
}
