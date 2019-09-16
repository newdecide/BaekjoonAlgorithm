package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {
    var sc: Scanner = Scanner(System.`in`)
    var n: Int = sc.nextInt();

    if (n >= 90) {
        println("A")
    } else if (n >= 80){
            println("B")
    } else if (n >= 70){
        println("C")
    } else if (n >= 60) {
        println("D")
    } else {
        println("F")
    }
}