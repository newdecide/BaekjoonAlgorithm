package kotlinalgo.k013_DinamicProgramming

import java.util.Scanner

object k013_02_190731_DP_tile {
    // 11726번
    // 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

    // d[n] = d[n-1] + d[n-2];
    var d: IntArray? = null

    fun process(n: Int) {
        for (i in 0..n) {
            if (i <= 2)
                d?.set(i, i)
            else {
                // 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
                d?.set(i, (d!![i - 1] + d!![i - 2]) % 10007)
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        try {
            val n = Integer.parseInt(sc.nextLine())
            d = IntArray(n + 1)
            process(n)
            print(d!![n])
            sc.close()
        } catch (e: Exception) {
            // TODO: handle exception
            e.printStackTrace()
        }

    }

}