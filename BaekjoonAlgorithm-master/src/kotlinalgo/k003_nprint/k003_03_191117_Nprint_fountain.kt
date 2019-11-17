package kotlinalgo.k003_nprint

import java.util.*

// 1193번
// 분수 찾기

// 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
// X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

// 14 (입력)
// 2/4 (출력)

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val num = `in`.nextInt()
    var tmp = 0
    var divisor = 0
    var dividend = 0
    for (i in 1..9999) {
        if (num > tmp && tmp + i >= num) {
            if (i % 2 == 0) {
                divisor = i + 1 - (num - tmp)
                dividend = num - tmp
            } else {
                divisor = num - tmp
                dividend = i + 1 - (num - tmp)
            }
            break
        }
        tmp += i
    }
    print("$dividend/$divisor")
}