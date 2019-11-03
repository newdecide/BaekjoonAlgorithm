package kotlinalgo.k014_input

import java.io.*

fun main(args: Array<String>) {
    // 2941번
    // 크로아티아 알파벳

    // 크로아티아 알파벳 6개(lj, e, š, nj, a, k)

    // ljes=njak
    // *es=njak
    // *es=*ak
    // *e**ak
    // 6

    // ddz=z=
    // d*z=
    // d**
    // 3

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val word = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var input = br.readLine().trim { it <= ' ' }
    var result = 0
    var i: Int
    i = 0
    while (i < word.size) {
        if (input.contains(word[i])) {
            input = input.replace(word[i].toRegex(), "*")
            println(input)
        }
        i++
    }
    result = input.length
    bw.write(result.toString() + "")
    bw.flush()
    br.close()
    bw.close()
}