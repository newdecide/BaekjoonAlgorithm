package javaalgo.j006_nsum;

import java.util.Scanner;

public class j006_04_191013_Factorial {
    // 10872번 팩토리얼
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

            int res = 1;

            for (int i = a; i >= 1; i--) {
                res *= i;
            }
        System.out.println(res);

    }

}
