package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    // 10817번
    // 세 가지 수 중 2번째 수

    var sc: Scanner = Scanner(System.`in`)

    var n = IntArray(3)

    for (i in 0..2){
        n[i] = sc.nextInt()
    }

    var tmp = 0;

    for (i in 0..2){
        for( j in 0..2) {
            if (n[i] > n[j]) {
                tmp = n[i]
                n[i] = n[j]
                n[j] = tmp
            }
        }
    }

    // 2번째 배열 출력
    println(n[1])
}