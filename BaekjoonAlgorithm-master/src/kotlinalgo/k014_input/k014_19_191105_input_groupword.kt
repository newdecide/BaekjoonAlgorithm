package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 1316번
    // 그룹단어체커

    // 입력
    // 3
    // happy
    // new
    // year
    // 출력
    // 3
    val sc = Scanner(System.`in`)

    var i = 0
    val n = sc.nextInt()// 단어 갯수 입력
    var answer = n// answer에 단어 갯수 대입

    for (test_case in 0 until n) {
        val word = sc.next()// 단어 입력
        val checker = BooleanArray(26)// 체커 배열 선언. 등장한 문자는 true로 변경한다.

        i = 1
        while (i < word.length) {// 단어의 길이만큼 반복
            if (word[i - 1] != word[i]) {// 현재 문자와 이전 문자가 같지 않다면
                if (checker[word[i].toInt() - 97] == true) { // 현재 문자가 이전에 나온적이 있다면
                    answer--            // 그룹단어가 아니므로 answer - 1
                    break               // 더 이상 확인할 필요가 없으므로 break;
                }
                checker[word[i - 1].toInt() - 97] = true//checker 배열의 현재 단어 위치를 true로 변경한다.
            }
            i++
        }
    }
    println(answer)
}