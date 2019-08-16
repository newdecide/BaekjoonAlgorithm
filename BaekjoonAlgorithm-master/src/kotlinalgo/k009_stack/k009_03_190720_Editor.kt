package kotlinalgo.k009_stack

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    // 1406번
    // 에디터 문제
    // L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
    // D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
    // B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
    //  	삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
    // P $	$라는 문자를 커서 왼쪽에 추가함

    // 변수 선언
    // 문자열 입력
    val br = BufferedReader(InputStreamReader(System.`in`))
    // 문자열 StringBuilder에 저장
    var s = StringBuilder(br.readLine())

    // 왼쪽 이동시 사용할 스택
    var Lstack = Stack<Char>()
    // 오른쪽 이동시 사용할 스택
    var Rstack = Stack<Char>()

    // 연산자 입력 찾기
    var n = br.readLine().toInt()

    // 문자열 왼쪽 스택에 추가
    for (i in 0 until s.length)
        Lstack.add(s.get(i))

    // 사용할 명령어 개수 입력
    while (n-- > 0) {
        var commend = br.readLine()

        if (commend.contains("P"))
            Lstack.add(commend.get(2))
        else {
            when (commend) {
                // L이면
                "L" -> {
                    // 왼쪽값이 비어있지 않으면
                    if (!Lstack.isEmpty())
                    // 왼쪽 스택에서 빼서 Rstack에 추가한다.
                        Rstack.add(Lstack.pop())
                }
                // 오른쪽 스택이 비어있지 않으면
                "D" -> {
                    // 오른쪽 스택에서 빼내고 Lstack 추가한다.
                    if (!Rstack.isEmpty())
                    // 오른쪽 스택에서 빼내고 Lstack 추가한다.
                        Lstack.add(Rstack.pop())
                }
                "B" -> {
                    if (!Lstack.isEmpty()) {
                        // Lstack이 비어있지 않으면 Lstack 빼낸다.
                        Lstack.pop()

                    }
                }
            }
        }
    }

    // Lstack에 값이 있으면 Lstack에서 빼내어 추가한다.
    while (!Lstack.isEmpty()) Rstack.add(Lstack.pop())


    // Rstack에 들어간 것을 빼내면서 출력한다.
    while (!Rstack.isEmpty()) print(Rstack.pop())

    // 입력
    // abcd
    // 3
    // P x
    // L
    // P y

    // 출력 abcdyx

    // 입력
    // abc
    // 9
    // L
    // L
    // L
    // L
    // L
    // P x
    // L
    // B
    // P y

    // 출력 yxabc

    // 입력
    // dmih
    // 11
    // B
    // B
    // P x
    // L
    // B
    // Bgit
    // B
    // P y
    // D
    // D
    // P z

    // 출력 yxz
}


