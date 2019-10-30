package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 2908번
    // 상수

    // 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면,
    // 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

    // 입력
    // 734 893
    // 출력
    // 437

    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(if (revNum(a) > revNum(b)) revNum(a) else revNum(b))
}

fun revNum(num: Int): Int {
    return 100 * (num % 10) + 10 * (num / 10 % 10) + num / 100
}
