package kotlinalgo.k008_starprint

import java.util.*

fun main(args: Array<String>) {
    // 2445번
    // 모래시계
    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *
    val sc: Scanner = Scanner(System.`in`)

    var n = sc.nextInt()

    // 1부터 n-1
    for(i in 1..n-1){
        // 0부터 i까지
        for(j in 1..i)
            print("*")
        for(k in (n*2)-(i*2) downTo 1)
            print(" ")
        for(j in i downTo 1)
            print("*")
        println()
    }
    for(i in n downTo 1){
        for(j in i downTo 1)
            print("*")
        for(k in  1..2*(n-i))
            print(" ")
        for(j in i downTo 1)
            print("*")
        println()
    }



}