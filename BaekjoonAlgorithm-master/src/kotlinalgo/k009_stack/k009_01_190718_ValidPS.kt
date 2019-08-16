package kotlinalgo.k009_stack

import java.io.BufferedReader
import java.util.*

fun main(args: Array<String>) {
    // 9012번
    // Stack 올바른 괄호 문자열

/**
6(확인할 문자열 개수)
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
 **/

    val br = BufferedReader(System.`in`.reader())
    var n = Integer.parseInt(br.readLine())

    while (n-- > 0) {
        var isVPS = true

        var input: String = br.readLine()
        println()
        var stack = Stack<Char>()

        var temp: Char

        for (i in 0 until input.length) {
            temp = input[i]

            // 스택 배열에 '(' 문자는 push하여 들어가고 ')' pop으로 빼낸다.
            if (temp == '(') {
                stack.push(temp)
            } else if (temp == ')') {
                if (!stack.empty()) {
                    stack.pop()
                } else {
                    isVPS = false
                    break
                }
            }
        }
        if (!stack.isEmpty()) isVPS = false

        if (isVPS) {
            // 올바른 괄호면 "YES"
            println("YES")
        } else {
            // 올바른 괄호가 아니면 "NO"
            println("NO")
        }

    }
}