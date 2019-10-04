package kotlinalgo.k002_divide

import java.util.*

fun main(args: Array<String>) {
    // 1546 번
    // 평균구하기
    // N개의 시험 성적을 입력받음
    // 최대값 M을 찾은 후 모든 점수를 점수/M*100으로 변경
    // 새로운 점수의 평균을 출력

    // 3 (평균 구할 개수)
    // 40 80 60( 평균 구할 값 입력)
    // 75.00 (결과값)
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var total = 0
    var max = 0
    var score: Int
    for (i in 0 until n) {
        score = sc.nextInt()
        total += score
        if (score > max) {
            max = score
        }
    }
    sc.close()

    var avg = 0.0
    avg = 100.0 * total / max.toDouble() / n.toDouble()
    System.out.printf("%.2f", avg)
}
