package kotlinalgo.k012_wordlength

import java.util.*
// 10808번
// 알파벳 개수 찾기
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextLine()
    var cnt = IntArray(26)
    for (i in 0 until s.length)
    {
        cnt[s.get(i) - 'a'] += 1
    }
    for (i in 0..25)
    {
        print(cnt[i])
    }
    println()
}
