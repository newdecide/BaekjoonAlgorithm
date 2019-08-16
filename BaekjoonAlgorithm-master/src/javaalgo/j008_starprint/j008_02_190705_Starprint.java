package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_02_190705_Starprint {
    public static void main(String[] args) {
        // 2439번
        // 별 찍기-2
        // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        //     *
        //    **
        //   ***
        //  ****
        // *****
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(1 <= n && n <= 100) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
