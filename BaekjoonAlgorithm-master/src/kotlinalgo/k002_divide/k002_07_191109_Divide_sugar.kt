package kotlinalgo.k002_divide

import java.util.*

fun main(args: Array<String>) {
// 2839번
// 설탕 배달
// 18개를 설탕 배달할때, 3개짜리 봉투와 5개짜리 봉투가 있다.
// 3개짜리 봉투는 6개들지만 5개짜리 봉투를 쓰면 4개가 든다.

// 입력 18
// 출력 4


    val scan = Scanner(System.`in`)

    val num = scan.nextInt()

    if (num % 5 % 3 != 0) {
        println(-1)
    } else {
        if (num % 5 != 0) {
            println(num / 5 + num % 5 / 3)
        } else {
            println(num / 5)
        }
    }
}