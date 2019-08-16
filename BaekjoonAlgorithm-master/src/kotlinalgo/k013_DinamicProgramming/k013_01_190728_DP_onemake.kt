package kotlinalgo.k013_DinamicProgramming

import java.util.*

fun main(args: Array<String>) {
    // 1463번
    // 1로 만들기
    // 1.n이 3으로 나누어 떨어지면, 3으로 나눈다
    // 2.n이 2로 나누어 떨어지면, 2로 나눈다.
    // 3.안 나눠지는 경우 1을 뺀다.

    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()

    //
    val dp = IntArray(n + 1)

    for(i in 2 .. n){
        dp[i] = dp[i - 1] + 1;

        if(i % 3 == 0){
            dp[i] = Math.min(dp[i], dp[i / 3] + 1)
        }
        if (i % 2 == 0) {
            dp[i] = Math.min(dp[i], dp[i / 2] + 1)
        }
    }
    print(dp[n])
    sc.close()
}