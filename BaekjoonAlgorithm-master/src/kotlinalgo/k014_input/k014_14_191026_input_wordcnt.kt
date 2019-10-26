package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 1157번
    // 단어에서 가장 많이 사용된 알파벳
    // 여러개 존재하면 ? 출력

    // 입력
    // Mississipi
    // 출력
    // ?

    // zZa
    // Z

    // baaa
    // A
    val sc = Scanner(System.`in`)
    val str = sc.nextLine().toUpperCase()

    val cnt = IntArray(26)
    var max = 0
    var result = '?'

    for (i in 0 until str.length) {
        cnt[str[i].toInt() - 65]++
        if (max < cnt[str[i].toInt() - 65]) {
            max = cnt[str[i].toInt() - 65]
            result = str[i]
        } else if (max == cnt[str[i].toInt() - 65]) {
            result = '?'
        }
    }
    println(result)

    sc.close()
}
