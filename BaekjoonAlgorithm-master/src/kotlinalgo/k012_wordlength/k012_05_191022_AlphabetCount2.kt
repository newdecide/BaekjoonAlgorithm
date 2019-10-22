package kotlinalgo.k012_wordlength

import java.util.*

fun main(args: Array<String>) {
    // 10808번
    // 알파벳 개수 찾기
    // 입력
    // hellowworld
    // 출력
    // 0 0 0 1 1 0 0 1 0 0 0 3 0 0 2 0 0 1 0 0 0 0 2 0 0 0
    val sc = Scanner(System.`in`)
    val s = sc.nextLine()
    val cnt = IntArray(26)
    for (i in 0 until s.length) {
        cnt[s[i] - 'a'] += 1
    }
    for (i in 0..25) {
        print(cnt[i].toString() + " ")
    }
    println()
}

