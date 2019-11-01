package kotlinalgo.k014_input

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

// 5622번
// 다이얼 전화기

// 입력
// UNUCIC
// 출력
// 36
@Throws(IOException::class)
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val dials = br.readLine().toCharArray()
    var sum = 0
    for (c in dials) {
        sum += 2
        when (c) {
            'W', 'X', 'Y', 'Z' -> {
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
            }
            'T', 'U', 'V' -> {
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
            }
            'P', 'Q', 'R', 'S' -> {
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
            }
            'M', 'N', 'O' -> {
                sum += 1
                sum += 1
                sum += 1
                sum += 1
                sum += 1
            }
            'J', 'K', 'L' -> {
                sum += 1
                sum += 1
                sum += 1
                sum += 1
            }
            'G', 'H', 'I' -> {
                sum += 1
                sum += 1
                sum += 1
            }
            'D', 'E', 'F' -> {
                sum += 1
                sum += 1
            }
            'A', 'B', 'C' -> sum += 1
        }
    }
    println(sum)

}
