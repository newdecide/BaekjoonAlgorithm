package kotlinalgo.k014_input

import java.util.*

// 2884번
// 알람 맞추기 45분전 시간 맞추기

// 입력 10 10
// 출력 9 25
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val H = sc.nextInt()
    val M = sc.nextInt()
    var ansH = H
    var ansM = M - 45
    if (ansM < 0) {
        ansM += 60
        ansH--
        if (ansH < 0) {
            ansH += 24
        }
    }
    println("$ansH $ansM")
    sc.close()
}