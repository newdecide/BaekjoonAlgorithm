package kotlinalgo.k007_maxmin

import java.util.*

fun main(args: Array<String>) {
    // 2562 번
    // 최대값 찾기(몇번째 위치했는가?)

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()

    val a = IntArray(n)
    for (i in a.indices) {
        a[i] = sc.nextInt()
    }
    sc.close()

    for (i in a.indices) {
        if (a[i] < x) {
            print(a[i].toString() + " ")
        }
    }
}