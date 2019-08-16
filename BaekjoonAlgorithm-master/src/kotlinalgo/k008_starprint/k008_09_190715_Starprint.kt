package kotlinalgo.k008_starprint

import java.util.*

fun main(args: Array<String>) {
    // 2522번
    //     *
    //    **
    //   ***
    //  ****
    // *****
    //  ****
    //   ***
    //    **
    //     *
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    for(i in 0 .. n){
        for(j in n-i downTo 1 ){
            print(" ")
        }
        for(k in 0 .. i)
            print("*")
        println()
    }
    for(i in 1 .. n){
        for(j in 0 until i ){
            print(" ")
        }
        for(k in n downTo i)
            print("*")
        println()
    }

}