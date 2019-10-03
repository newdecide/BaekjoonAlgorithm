package kotlinalgo.k002_divide


import java.io.*

fun main(args: Array<String>) {
    // 3052번
    // 나머지
    // 입력
    // 39
    // 40
    // 41
    // 42
    // 43
    // 44
    // 82
    // 83
    // 84
    // 85
    // 출력
    // 6

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val chk = BooleanArray(42)
    var cnt = 0
    for (i in 0..9) {
        val a = Integer.parseInt(br.readLine())
        if (!chk[a % 42]) {
            chk[a % 42] = true
            cnt++
        }
    }
    bw.write(cnt.toString() + "\n")
    bw.flush()
    br.close()
    bw.close()
}