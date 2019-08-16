package javaalgo.j002_divide;

import java.util.Scanner;

public class j002_01_190704_Divide {
    // 1008번
    // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        System.out.println(a / b);
    }
}
