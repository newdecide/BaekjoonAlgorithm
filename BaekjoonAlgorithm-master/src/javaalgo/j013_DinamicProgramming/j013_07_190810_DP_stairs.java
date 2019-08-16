package javaalgo.j013_DinamicProgramming;

import java.util.Scanner;

public class j013_07_190810_DP_stairs {
    // 10844번
    // 계단수

    // 45656이란 수를 보자.
    // 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
    // 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
    // N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[101][11];

        // dp[N][L] = dp[N - 1][L - 1] + dp[N - 1][L + 1]
        // 길이 N, 마지막 숫자가 L일 경우

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j <= 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[n][i];
        }
        System.out.println(sum % 1000000000);
    }

}
