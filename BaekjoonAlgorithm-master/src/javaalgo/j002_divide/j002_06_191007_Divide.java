package javaalgo.j002_divide;

import java.util.Scanner;

public class j002_06_191007_Divide {
    // 4344번
    // 평균 구하기

    // 5개의 평균을 구한다.

    // 입력값
    // 5
    // 5 50 50 70 80 100
    // 7 100 95 90 80 70 60 50
    // 3 70 90 80
    // 3 70 90 81
    // 9 100 99 98 97 96 95 94 93 91

    // 결과값
    // 40.000%
    // 57.143%
    // 33.333%
    // 66.667%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n, total, count;
        double avg;
        int scores[] = new int[1000];

        for (int i = 0; i < c; ++i) {
            n = sc.nextInt();
            total = 0;
            count = 0;
            for (int j = 0; j < n; ++j) {
                scores[j] = sc.nextInt();
                total += scores[j];
            }
            avg = (double)total / n;

            for (int j = 0; j < n; ++j) {
                if (scores[j] > avg) {
                    count++;
                }
            }
            System.out.println();
            System.out.printf("%.3f", 100.0 * count / n);
            System.out.println("%");
        }
        sc.close();
    }
}
