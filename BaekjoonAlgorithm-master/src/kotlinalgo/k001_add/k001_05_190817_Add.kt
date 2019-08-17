package kotlinalgo.k001_add

import java.util.*
    // 1110번
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var num = sc.nextInt()

        var cnt = 1
        val chk = num
        while (true) {
            val a = num / 10
            val b = num % 10
            val c = a + b
            num = b * 10 + c % 10

            if (num == chk)
                break
            else {
                cnt++
            }
        }
        println(cnt)

}