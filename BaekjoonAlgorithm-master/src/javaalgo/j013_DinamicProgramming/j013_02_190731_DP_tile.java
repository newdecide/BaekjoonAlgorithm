package javaalgo.j013_DinamicProgramming;

import java.util.Scanner;

public class j013_02_190731_DP_tile {
    // 11726번
    // 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

    // d[n] = d[n-1] + d[n-2];
    private static int[] d;
    private static void process(int n) {
        for(int i=0; i<=n; i++) {
            if(i <= 2) d[i] = i;
            else {
                // 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
                d[i] = (d[i-1] + d[i-2]) % 10007;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            d = new int[n+1];
            process(n);
            System.out.print(d[n]);
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
