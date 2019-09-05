package kotlinalgo.k001_add

import java.util.*

fun main(args: Array<String>) {
    // 1978
    // 소수 개수 세기
    // 1과 자신으로 밖에 안 나눠지는 수
    // 개수 입력 4
    // 숫자 입력 1 3 5 7
    // 3 5 7 : 3개
    
    val sc = Scanner(System.`in`)

    val num = sc.nextInt()
    var decimalCnt = 0
    var cnt = 0

    for (i in 1..num) {
        val num2 = sc.nextInt()
        decimalCnt = 0

        for (j in 1..num2) {
            if (num2 % j == 0)
                decimalCnt++
        }

        if (decimalCnt == 2)
            cnt++
    }
    print(cnt)

}
