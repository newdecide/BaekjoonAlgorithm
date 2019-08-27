package kotlinalgo.k001_add

import java.util.*

fun main(args: Array<String>) {
    // 1912번

    // 연속합
    // 10
    // 10 -4 3 1 5 6 -35 12 21 -1
    // 33: 결과값

    // 숫자 중에서 가장 큰수 2개를 더한다.
    val sc = Scanner(System.`in`)
    val N = Integer.parseInt(sc.nextLine())
    val str = sc.nextLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    val arr = IntArray(N)
    val dp = IntArray(N)
    var max: Int
    for (i in 0 until N) {
        arr[i] = Integer.parseInt(str[i])
    }
    dp[0] = arr[0]
    max = arr[0]
    for (i in 1 until N) {
        dp[i] = Math.max(dp[i - 1] + arr[i], arr[i])

        max = Math.max(max, dp[i])
    }
    sc.close()
    println(max)
}