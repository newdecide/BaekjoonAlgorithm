package kotlinalgo.k001_add

import java.util.*

fun main(args: Array<String>) {
    // 2588번
    
    // 곱셈연산
    //    472
    //  x 385
    //   2360
    //  3776
    // 1416
    // 181720

    val sc = Scanner(System.`in`)

    val num1 = Integer.parseInt(sc.nextLine())
    val num2 = Integer.parseInt(sc.nextLine())

    solve(num1, num2)
    sc.close()
}

private fun solve(num1: Int, num2: Int) {
    var temp = num2
    while (temp > 0) {
        println(num1 * (temp % 10))
        temp /= 10
    }
    println(num1 * num2)
}
