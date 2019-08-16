package kotlinalgo.k008_starprint

import java.util.*

fun main(args: Array<String>) {
    // 2444번
    // 별 찍기-7
    //    *
    //   ***
    //  *****
    // *******
    //*********
    // *******
    //  *****
    //   ***
    //    *
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    if (1 <= n && n <= 100) {
        // 0 -> 1 -> 2 -> 3 -> 4
        for (i in 0..n-1) {
            // 4 -> 3 -> 2 -> 1
            for (j in 0..n - i - 1) {
                print(" ")
            }
            // 0 -> 2 -> 4 -> 6 -> 8
            for (k in 0..2 * i) {
                print("*")
            }
            println()
        }
        // 4 -> 3 -> 2 -> 1
        for (i in n-1 downTo 1){
            // 1 -> 2 -> 3 -> 4
            for (j in 0..n-i){
                print(" ")
            }
            // 7 -> 5 -> 3 -> 1
            for (k in 2*i-1 downTo 1){
                print("*")
            }
            println()
        }
    }
}