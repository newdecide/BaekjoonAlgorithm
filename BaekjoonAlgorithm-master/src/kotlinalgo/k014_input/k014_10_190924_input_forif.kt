package kotlinalgo.k014_input

import java.util.*

// 10871번
// x보다 작은 수

// 10 5
// 1 10 4 9 2 3 8 5 7 6

fun main(args: Array<String>) {
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