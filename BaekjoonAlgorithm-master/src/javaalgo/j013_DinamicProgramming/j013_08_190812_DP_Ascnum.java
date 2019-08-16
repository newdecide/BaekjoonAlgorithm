package javaalgo.j013_DinamicProgramming;

import java.util.Scanner;

public class j013_08_190812_DP_Ascnum {
    // 11057번
    // 오르막수
    // 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.
    // 예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.
    // 수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 한 자릿수는 모두 1로 초기화 해준다.(0포함)
        int[][] dp = new int[N+1][10];
        for(int i = 0; i <= 9; i++) {
            dp[1][i] = 1;
        }

        // 2. dp[i][j] = dp[i-1][k]를 이용해 오르막 수를 구한다.(k <= j)
        // 	  배열 첫번째 인덱스가 의미하는 것 : N 자릿수., i
        //    배열 두번째 인덱스가 의미하는 것 : 마지막에 위치하는 수., j
        //    k인덱스가 의미하는 것 : 마지막에 위치한 수 보다 작은 수.
        for(int i = 2; i <=N; i++) {
            for(int j = 0; j <= 9; j++) {
                for(int k = 0; k <= j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        //3. N 자릿수로 생성된 오르막 수들의 결과를 모두 더해 답을 구한다.
        long result = 0;
        for(int i = 0; i <= 9; i++) {
            result += dp[N][i];
        }
        result %= 10007;
        System.out.println(result);
        sc.close();
    }
}
