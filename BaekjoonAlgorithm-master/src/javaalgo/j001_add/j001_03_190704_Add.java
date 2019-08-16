package javaalgo.j001_add;

import java.util.Scanner;

public class j001_03_190704_Add {
    // 10952번
    // 입력은 여러 개의 테스트 케이스로 이루어져 있다.
    // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    // 입력의 마지막에는 0 두 개가 들어오면 종료가 되도록 만드시오.
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
    // 0 0
    // 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        do {
            a = sc.nextInt();
            b = sc.nextInt();

            // a가 0이고 b도 0이 아니면 계속 a+b를 더한다
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a + b);

        } while (sc.hasNextInt());

    }
}
