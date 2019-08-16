package kotlinalgo.k009_stack

import java.util.*

fun main(args: Array<String>) {
    // 쇠막대기
    // 10799번

    // 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍'()'으로 표현
    // '()' 반드시 레이저를 표현한다.
    // 쇠맏대기의 왼쪽 끝은 여는 괄호'()'로, 오른쪽 끝은 닫힌 괄호')'로 표현된다.

    // 예제1 결과 17
    // ()(((()())(())()))(())

    // 예제2 결과 24
    // (((()(()()))(())()))(()())
    val sc : Scanner = Scanner(System.`in`)

    var input = sc.nextLine()
    var stack = Stack<Int>()
    var result = 0;

    for(i in 0 until input.length){
        var arr = input.get(i)
        if(arr == '('){
            stack.push(i)
        } else if(arr ==')'){
            if(stack.peek() + 1 == i){
                stack.pop()
                result += stack.size
            } else {
                stack.pop()
                result++
            }
        }
    }
    println(result)
}