package kotlinalgo.k006_nsum

import java.util.*

// 2577번
// 자릿수 개수세기
// 150
// 266
// 427
// 3
// 1
// 0
// 2
// 0
// 0
// 0
// 2
// 0
// 0\
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    val B = sc.nextInt()
    val C = sc.nextInt()
    sc.close()

    val counts = IntArray(10)
    var number = A * B * C
    while (number > 0) {
        counts[number % 10]++
        number /= 10
    }

    for (i in counts.indices) {
        println(counts[i])
    }
}