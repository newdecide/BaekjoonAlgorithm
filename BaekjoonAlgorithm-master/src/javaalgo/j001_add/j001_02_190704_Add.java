package javaalgo.j001_add;

import java.util.Scanner;

public class j001_02_190704_Add {
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
    public static void main(String[] args) {
        // 개수를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        // 입력한 개수만큼 변수 선언 후 출력
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
