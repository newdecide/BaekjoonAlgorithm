package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_01_190705_Starprint {
    // 2438번
    // 별 찍기-1
    // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    // *
    // **
    // ***
    // ****
    // *****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            for(int j =0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
