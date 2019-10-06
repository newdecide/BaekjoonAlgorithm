package kotlinalgo.k012_wordlength

import java.util.*

fun main(args: Array<String>) {
    // 8958번
    // "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
    // "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
    // OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val cases = arrayOfNulls<String>(N)
    for (i in 0 until N) {
        cases[i] = sc.next()
    }
    sc.close()

    var count: Int
    var total: Int
    for (OXresult in cases) {
        count = 0
        total = 0
        for (i in 0 until OXresult!!.length) {
            if (OXresult!!.get(i) == 'O') {
                total += ++count
            } else {
                count = 0
            }
        }
        println(total)
    }
}

