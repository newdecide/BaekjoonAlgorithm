package javaalgo.j009_stack;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class j009_02_190719_Ironrod {
    // 쇠막대기
    // 10799번

    // 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍'()'으로 표현
    // '()' 반드시 레이저를 표현한다.
    // 쇠맏대기의 왼쪽 끝은 여는 괄호'()'로, 오른쪽 끝은 닫힌 괄호')'로 표현된다.

    // 예제1 결과 17
    // ()(((()())(())()))(())

    // 예제2 결과 24
    // (((()(()()))(())()))(()())

    public static void main(String[] args) throws IOException {
        // 문자열 입력
        Scanner sc = new Scanner(System.in);

        // 한줄로 intput에 저장
        String input = sc.nextLine();
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            // 문자열 i번째 데이터 가져오기
            char arr = input.charAt(i);

            if (arr == '(') {
                stack.push(i);
            } else if (arr == ')') {
                if (stack.peek() + 1 == i) {
                    stack.pop();
                    result += stack.size();
                } else {
                    stack.pop();
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
