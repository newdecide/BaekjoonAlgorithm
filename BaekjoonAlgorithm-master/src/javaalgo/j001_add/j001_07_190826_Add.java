package javaalgo.j001_add;

import java.util.Scanner;

public class j001_07_190826_Add {
    public static void main(String[] args) {
        // 1912번
        // 연속합

        // 10
        // 10 -4 3 1 5 6 -35 12 21 -1
        // 33: 결과값

        // 숫자중에서 가장 큰수 2개를 더한다.
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[N];
        int[] dp = new int[N];
        int max;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        dp[0] = arr[0];
        max = arr[0];
        for(int i=1; i<N; i++){
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);

            max = Math.max(max, dp[i]);
        }
        sc.close();
        System.out.println(max);
    }
}
