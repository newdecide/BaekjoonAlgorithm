package kotlinalgo.k002_divide

import java.util.*

fun main(args: Array<String>) {
    // 4344번
    // 평균 구하기

    // 5개의 평균을 구한다.

    // 입력값
//     5
//     5 50 50 70 80 100
//     7 100 95 90 80 70 60 50
//     3 70 90 80
//     3 70 90 81
//     9 100 99 98 97 96 95 94 93 91

    // 결과값
    // 40.000%
    // 57.143%
    // 33.333%
    // 66.667%
    val sc = Scanner(System.`in`)
    val c = sc.nextInt()
    var n: Int
    var total: Int
    var count: Int
    var avg: Double
    val scores = IntArray(1000)

    for (i in 0 until c) {
        n = sc.nextInt()
        total = 0
        count = 0
        for (j in 0 until n) {
            scores[j] = sc.nextInt()
            total += scores[j]
        }
        avg = total.toDouble() / n

        for (j in 0 until n) {
            if (scores[j] > avg) {
                count++
            }
        }
        println()
        System.out.printf("%.3f", 100.0 * count / n)
        println("%")
    }
    sc.close()
}
