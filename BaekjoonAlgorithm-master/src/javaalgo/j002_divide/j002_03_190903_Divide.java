package javaalgo.j002_divide;

import java.util.Scanner;

public class j002_03_190903_Divide {
        // 10430
        // 나머지
        // 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sc.close();

            System.out.println((a + b) % c);
            System.out.println((a % c + b % c) % c);
            System.out.println((a * b) % c);
            System.out.println((a % c * b % c) % c);
        }

}
