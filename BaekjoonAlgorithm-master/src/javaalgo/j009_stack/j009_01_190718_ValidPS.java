package javaalgo.j009_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class j009_01_190718_ValidPS {
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
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력할 개수
        int n = Integer.parseInt(br.readLine());
        System.out.println();
        while(n-->0) {
            boolean isVPS = true;

            String input = br.readLine();

            Stack<Character> stack = new Stack<>();

            char temp;

            for(int i = 0; i < input.length(); i++) {
                temp = input.charAt(i);

                if (temp == '(') {
                    // 여는 괄호는 스택에 push하여 추가한다.
                    stack.push(temp);
                } else if (temp == ')') {
                    // 스택이 비어있는지 확인
                    if (!stack.empty()) {
                        // 스택의 맨 위 값을 pop한다.
                        stack.pop();
                    } else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) isVPS = false;

            if (isVPS) {
                // 올바른 괄호면 "YES"
                System.out.println("YES");
            } else {
                // 올바른 괄호가 아니면 "NO"
                System.out.println("NO");
            }
        }
    }
}
