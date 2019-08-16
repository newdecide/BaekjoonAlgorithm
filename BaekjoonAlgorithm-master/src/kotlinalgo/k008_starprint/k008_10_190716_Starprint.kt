package kotlinalgo.k008_starprint

import java.util.*

fun main(args: Array<String>) {
    // 10991번
    // 별찍기 10
    // 1 -> *
    // 2 ->  *
    //      * *
    // 5 ->
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *

    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    for(i in 1..n){
        for(j in i..n-1){
            print(" ")
        }
        for(j in 1 until i*2){
            if(j % 2 == 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}