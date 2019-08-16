package kotlinalgo.k008_starprint

import java.util.*

fun main(args: Array<String>) {
    // 별찍기-17
    // 10992번
    // 5
    //     *
    //    * *
    //   *   *
    //  *     *
    // *********

    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    for(i in 1..n){
        for(j in 1..n+i-1){
            if(j==n+i-1) print("*") // 마지막 라인
            else if(i>1 && n-i+1 == j) print("*") // 첫별
            else if(i == n) print("*")
            else print(" ")
        }
        println()
    }
}