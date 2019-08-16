package kotlinalgo.k008_starprint

import java.util.*

fun main(args: Array<String>) {
    // 별찍기-9
    // 2446
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    //    ***
    //   *****
    //  *******
    // *********

    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    for (i in 1..n) {
        for (j in 1..i)
            print(" ")
        for (k in (n*2)-(i*2) downTo 0)
            print("*")
        for (j in i downTo 1)
            print(" ")
        println()
    }
    for (i in n-1 downTo 1) {
        for (j in i downTo 1)
            print(" ")
        for (k in  0..2*(n-i))
            print("*")
        for (j in i downTo 1)
            print(" ")
        println()
    }
}