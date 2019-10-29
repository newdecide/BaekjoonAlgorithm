package kotlinalgo.k014_input

import java.util.*

// 1152
// 단어의 개수

// 입력
// 출력
// The Curious Case of Benjamin Button
// 6

// Mazatneunde Wae Teullyeoyo
// 3

// Teullinika Teullyeotzi
// 2
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().trim { it <= ' ' }
    sc.close()

    if (input.isEmpty()) {
        println(0)
    } else {
        println(input.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray().size)
    }
}