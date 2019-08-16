package kotlinalgo.k013_DinamicProgramming

import java.util.*

// 11057번
// 오르막수
// 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.
// 예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.
// 수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()

    // 1. 한 자릿수는 모두 1로 초기화 해준다.(0포함)
    val dp = Array(N + 1) { IntArray(10) }
    for (i in 0..9) {
        dp[1][i] = 1
    }

    // 2. dp[i][j] = dp[i-1][k]를 이용해 오르막 수를 구한다.(k <= j)
    // 	  배열 첫번째 인덱스가 의미하는 것 : N 자릿수., i
    //    배열 두번째 인덱스가 의미하는 것 : 마지막에 위치하는 수., j
    //    k인덱스가 의미하는 것 : 마지막에 위치한 수 보다 작은 수.
    for (i in 2..N) {
        for (j in 0..9) {
            for (k in 0..j) {
                dp[i][j] += dp[i - 1][k]
                dp[i][j] %= 10007
            }
        }
    }

    //3. N 자릿수로 생성된 오르막 수들의 결과를 모두 더해 답을 구한다.
    var result: Long = 0
    for (i in 0..9) {
        result += dp[N][i].toLong()
    }
    result %= 10007
    println(result)
    sc.close()
}