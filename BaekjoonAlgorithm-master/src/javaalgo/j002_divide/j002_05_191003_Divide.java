package javaalgo.j002_divide;

import java.util.Scanner;

public class j002_05_191003_Divide {
    // 1546번
    // 평균구하기
    // N개의 시험 성적을 입력받음
    // 최대값 M을 찾은 후 모든 점수를 점수/M*100으로 변경
    // 새로운 점수의 평균을 출력

    // 3 (평균 구할 개수)
    // 40 80 60( 평균 구할 값 입력)
    // 75.00 (결과값)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int max = 0;
        int score;
        for (int i = 0; i < n; ++i) {
            score = sc.nextInt();
            total += score;
            if (score > max) {
                max = score;
            }
        }
        sc.close();

        double avg = 0;
        avg = 100.0 * total / max / n;
        System.out.printf("%.2f", avg);
    }
}
