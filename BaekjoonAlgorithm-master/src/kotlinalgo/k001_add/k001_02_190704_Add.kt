package kotlinalgo.k001_add

import java.util.*
import jdk.nashorn.internal.objects.Global.println
fun main(args: Array<String>) {
    // 10950번
    // 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    // 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

    // 5(테스트 개수)
    // 1 1
    // 2
    // 2 3
    // 5
    // 3 4
    // 7
    // 9 8
    // 17
    // 5 2
    // 7
        // 개수를 입력 받는다.
        val sc = Scanner(System.`in`)
        val t = sc.nextInt()
        var a: Int
        var b: Int
        // 입력한 개수만큼 변수 선언 후 출력
        for (i in 0 .. t-1) {
            a = sc.nextInt()
            b = sc.nextInt()
            println(a+b)
        }
}