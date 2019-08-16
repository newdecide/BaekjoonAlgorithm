package javaalgo.j009_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class j009_03_190720_Editor {
    // 1406번
    // 에디터 문제
    // L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
    // D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
    // B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
    //  	삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
    // P $	$라는 문자를 커서 왼쪽에 추가함

    public static void main(String[] args) throws IOException {
        // 변수 선언
        // 문자열 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자열 변수로 저장
        StringBuilder s = new StringBuilder(br.readLine());

        // 왼쪽 이동시 사용할 스택
        Stack Lstack = new Stack();
        // 오른쪽 이동시 사용할 스택
        Stack Rstack = new Stack();

        // 연산자 입력 찾기
        int n = Integer.parseInt(br.readLine());

        // 문자열 왼쪽 스택에 추가
        for(int i = 0; i < s.length(); i++){
            Lstack.add(s.charAt(i));
        }

        // 사용할 명령어 개수 입력

        // n이 0이 될 때까지 반복
        while (n-- > 0){
            String commend = br.readLine();
            // contains는 string에서 문자를 포함하는지 확인
            // P문자를 포함하고 있으면
            if(commend.contains("P"))
                // 왼쪽 커서위치에 추가 입력할 때 'P ' 다음문자 입력하기 위함
                Lstack.add(commend.charAt(2));
            else {
                switch(commend){
                    // L이면
                    case "L":
                        // 왼쪽값이 비어있지 않으면
                        if(!Lstack.isEmpty())
                            // 왼쪽 스택에서 빼서 Rstack에 추가한다.
                            Rstack.add(Lstack.pop());
                        break;
                    case "D":
                        // 오른쪽 스택이 비어있지 않으면
                        if(!Rstack.isEmpty())
                            // 오른쪽 스택에서 빼내고 Lstack 추가한다.
                            Lstack.add(Rstack.pop());
                        break;
                    case "B":
                        // Lstack이 비어있지 않으면 Lstack 빼낸다.
                        if(!Lstack.isEmpty())
                            Lstack.pop();
                        break;
                }
            }
        }

        System.out.println("Lstack: "+Lstack);
        // Lstack에 값이 있으면 Lstack에서 빼내어 추가한다.
        while (!Lstack.isEmpty()) Rstack.add(Lstack.pop());

        System.out.println("Rstack"+Rstack);
        // Rstack에 들어간 것을 빼내면서 출력한다.
        while (!Rstack.isEmpty()) System.out.print(Rstack.pop());

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
        // B
        // B
        // P y
        // D
        // D
        // P z

        // 출력 yxz
    }
}
