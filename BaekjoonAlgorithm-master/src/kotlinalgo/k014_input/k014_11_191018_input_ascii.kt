package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 11654
    // 문자열 검색
    // 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
    // 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
        val sc = Scanner(System.`in`)

        val ascii = sc.next()
        val result = ascii[0].toInt()

        println(result)
}