package kotlinalgo.k007_maxmin

import java.util.*

// 2920번

// 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

//연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val inputs = IntArray(8)
    for (i in inputs.indices) {
        inputs[i] = sc.nextInt()
    }
    sc.close()

    var output = ""
    for (i in 0 until inputs.size - 1) {
        if (inputs[i] == inputs[i + 1] - 1) {
            output = "ascending"
        } else if (inputs[i] == inputs[i + 1] + 1) {
            output = "descending"
        } else {
            output = "mixed"
            break
        }
    }
    println(output)
}