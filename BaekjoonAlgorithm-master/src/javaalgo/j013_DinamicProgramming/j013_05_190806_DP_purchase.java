package javaalgo.j013_DinamicProgramming;

import java.util.Scanner;

public class j013_05_190806_DP_purchase {
    // 11052번
    // 카드 구매하기

    // 카드 N개를 구매해야한다.
    // 카드팩에 들어있는 카드가 적은 것부터 산다.
    // 카드 N개를 구매하는데 드는 비용의 최대를 구하는 문제이다.

    // 카드 1개가 들어있는 카드팩을 구매하고, 카드 i-1개를 구입한다.
    // 카드 2개가 들어있는 카드팩을 구매하고, 카드 i-2개를 구입한다.
    // 카드 3개가 들어있는 카드팩을 구매하고, 카드 i-3개를 구입한다.

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= i; j++){
                d[i] = Math.max(d[i], d[i - j] + arr[j]);
            }
        }

        System.out.println(d[n]);
        sc.close();

    }
}
