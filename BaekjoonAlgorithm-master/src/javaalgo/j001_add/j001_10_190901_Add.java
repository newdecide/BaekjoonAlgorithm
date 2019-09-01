package javaalgo.j001_add;

import java.io.IOException;
import java.util.Scanner;

public class j001_10_190901_Add {
    // 1978
    // 소수 개수 세기
    // 1과 자신으로 밖에 안 나눠지는 수
    // 개수 입력 4
    // 숫자 입력 1 3 5 7
    // 3 5 7 : 3개

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int decimalCnt = 0, cnt = 0;

        for (int i = 1; i <= num; i++) {
            int num2 = sc.nextInt();
            decimalCnt = 0;

            for (int j = 1; j <= num2; j++) {
                if (num2 % j == 0)
                    decimalCnt++;
            }

            if (decimalCnt == 2)
                cnt++;
        }
        System.out.print(cnt);
    }
}
