package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 2292번
    // 벌집
    // 6각형으로 이루어진 벌집의 중심

    // 입출력
    // 13 -> 3, 58 -> 5

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    var rslt = 1
    var roomNum = 1
    var addNum = 6
    while (true) {
        if (n <= roomNum) {
            break
        }
        roomNum += addNum
        addNum += 6
        rslt++
    }

    println(rslt)
}
