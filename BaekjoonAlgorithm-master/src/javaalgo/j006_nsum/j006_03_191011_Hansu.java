package javaalgo.j006_nsum;

import java.util.Scanner;

public class j006_03_191011_Hansu {
    // 1065번
    // 한수
    // 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력

    // 입력         결과
    // 110          99
    // 1            1
    // 210          105
    // 1000         144

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int cnt = 0;

        if( x < 100) {
            System.out.println(x);
            return;
        }

        cnt = 99;

        for(int i=100; i<=x; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            if(a-b == b-c)
                cnt++;
        }

        System.out.println(cnt);
        s.close();
    }
}
