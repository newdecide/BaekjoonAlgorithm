package kotlinalgo.k013_DinamicProgramming

import java.util.*
// 11052번
// 카드 구매하기

// 카드 N개를 구매해야한다.
// 카드팩에 들어있는 카드가 적은 것부터 산다.
// 카드 N개를 구매하는데 드는 비용의 최대를 구하는 문제이다.

// 카드 1개가 들어있는 카드팩을 구매하고, 카드 i-1개를 구입한다.
// 카드 2개가 들어있는 카드팩을 구매하고, 카드 i-2개를 구입한다.
// 카드 3개가 들어있는 카드팩을 구매하고, 카드 i-3개를 구입한다.

fun main(args: Array<String>) {


    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val arr = IntArray(n + 1)
    val d = IntArray(n + 1)

    for (i in 1..n) {
        arr[i] = sc.nextInt()
    }

    for (i in 1..n) {
        for (j in 1..i) {
            d[i] = Math.max(d[i], d[i - j] + arr[j])
        }
    }

    println(d[n])
    sc.close()

}

