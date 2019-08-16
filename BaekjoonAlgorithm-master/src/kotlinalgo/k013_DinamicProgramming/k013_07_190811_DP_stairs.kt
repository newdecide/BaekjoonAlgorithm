package kotlinalgo.k013_DinamicProgramming

import java.util.*

fun main(args: Array<String>) {
    // 10844번
    // 계단수

    // 45656이란 수를 보자.
    // 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
    // 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
    // N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val dp = Array(101) { LongArray(11) }

    // dp[N][L] = dp[N - 1][L - 1] + dp[N - 1][L + 1]
    // 길이 N, 마지막 숫자가 L일 경우

    for (i in 1..9) {
        dp[1][i] = 1
    }

    for (i in 2..n) {
        dp[i][0] = dp[i - 1][1]
        for (j in 1..9) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000
        }
    }

    var sum: Long = 0
    for (i in 0..9) {
        sum += dp[n][i]
    }
    println(sum % 1000000000)
}