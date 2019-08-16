
package javaalgo.j013_DinamicProgramming;

import java.util.Scanner;

public class j013_01_190728_DP_onemake {
    public static void main(String[] args) {
        // 1463번
        // 1로 만들기
        // 1.n이 3으로 나누어 떨어지면, 3으로 나눈다
        // 2.n이 2로 나누어 떨어지면, 2로 나눈다.
        // 3.안 나눠지는 경우 1을 뺀다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        System.out.println(dp[n]);

        sc.close();
    }
}
