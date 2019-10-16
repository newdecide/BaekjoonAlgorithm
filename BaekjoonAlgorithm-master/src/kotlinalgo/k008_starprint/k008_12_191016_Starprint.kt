package kotlinalgo.k008_starprint

import java.util.*

private val sc = Scanner(System.`in`)
private var starMap: Array<CharArray>? = null

// 2447번
// 별찍기
fun main(args: Array<String>) {
    val num = sc.nextInt()
    starMap = Array(num) { CharArray(num) }

    for (i in 0 until num) {
        Arrays.fill(starMap!![i], ' ')
    }

    solve(0, 0, num)
    for (i in 0 until num) {
        println(starMap!![i])
    }
}

fun solve(x: Int, y: Int, n: Int) {
    if (n == 1) {
        starMap!![x][y] = '*'
        return
    }
    val m = n / 3
    for (i in 0..2) {
        for (j in 0..2) {
            if (i == 1 && j == 1) {
                continue
            }
            solve(x + m * i, y + m * j, m)
        }
    }
}


// ***************************
// * ** ** ** ** ** ** ** ** *
// ***************************
// ***   ******   ******   ***
// * *   * ** *   * ** *   * *
// ***   ******   ******   ***
// ***************************
// * ** ** ** ** ** ** ** ** *
// ***************************
// *********         *********
// * ** ** *         * ** ** *
// *********         *********
// ***   ***         ***   ***
// * *   * *         * *   * *
// ***   ***         ***   ***
// *********         *********
// * ** ** *         * ** ** *
// *********         *********
// ***************************
// * ** ** ** ** ** ** ** ** *
// ***************************
// ***   ******   ******   ***
// * *   * ** *   * ** *   * *
// ***   ******   ******   ***
// ***************************
// * ** ** ** ** ** ** ** ** *
// ***************************

