package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_07_190707_Starprint {
    public static void main(String[] args) {
        // 2445번
        // 모래시계

        // *                 *
        // * *             * *
        // * * *         * * *
        // * * * *     * * * *
        // * * * * * * * * * *
        // * * * *     * * * *
        // * * *         * * *
        // * *             * *
        // *                 *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n * 2;

        String[][] arr = new String[n][n];

        int center = (n / 2);

        // 2차원 배열 *로 채운다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "*";
            }
        }
        // 1~100까지 숫자만 실행된다.
        if (1 <= n && n <= 100) {
            for (int i = 0; i < n; i++) {
                if (center > i) {
                    for (int j = i; j < n - i; j++) {
                        arr[i][j] = " ";
                    }
                } else {
                    for (int j = n - i; j < i; j++) {
                        arr[i][j] = " ";
                    }
                }
            }

            // 배열 출력문
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
