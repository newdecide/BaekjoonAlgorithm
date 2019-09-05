package kotlinalgo.k002_divide

import java.util.*

// 10430
// 나머지
// 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

// 5 8 4 입력
// 출력
// 1
// 1
// 0
// 0

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    sc.close()

    println((a + b) % c)
    println((a % c + b % c) % c)
    println(a * b % c)
    println(a % c * b % c % c)
}
