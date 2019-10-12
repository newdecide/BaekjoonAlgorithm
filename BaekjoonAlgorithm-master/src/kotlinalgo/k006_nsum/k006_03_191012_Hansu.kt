package kotlinalgo.k006_nsum

import java.util.*

// 1065번
// 한수
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력

// 입력         결과
// 110          99
// 1            1
// 210          105
// 1000         144
fun main(args: Array<String>) {
    val s = Scanner(System.`in`)

    val x = s.nextInt()
    var cnt = 0

    if (x < 100) {
        println(x)
        return
    }

    cnt = 99

    for (i in 100..x) {
        val a = i / 100
        val b = i / 10 % 10
        val c = i % 10

        if (a - b == b - c)
            cnt++
    }

    println(cnt)
    s.close()
}