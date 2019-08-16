package javaalgo.j013_DinamicProgramming;

import java.util.Scanner;

public class j013_04_190804_DP_tile2 {
    // 11727번
    // 2xn 타이링2
    // 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
    //아래 그림은 2×17 직사각형을 채운 한가지 예이다.

    private static int[] d;
    // BOTTOM-UP
    public static int bottomUp (int n) {
        d[0] = 1;
        if (n > 0) d[1] = 1;
        for (int i=2; i<=n; i++) {
            d[i] = (2 * d[i-2]) + d[i-1];
            d[i] %= 10007;
        }
        return d[n];
    }

    // TOP-DOWN
    public static int topDown (int n) {
        if (n == 0 || n == 1) return 1;
        if (d[n] > 0) return d[n];

        d[n] = 2 * topDown(n-2) + topDown(n-1);
        d[n] %= 10007;

        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            d = new int[n+1];
            topDown(n);
            System.out.print(d[n]);
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
