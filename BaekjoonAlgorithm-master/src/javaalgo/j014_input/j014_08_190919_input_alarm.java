package javaalgo.j014_input;

import java.util.Scanner;

public class j014_08_190919_input_alarm {
    // 2884번
    // 알람 맞추기

    // 입력 10 10
    // 출력 9 25

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int ansH = H;
        int ansM = M - 45;
        if(ansM < 0){
            ansM += 60;
            ansH--;
            if(ansH < 0){
                ansH += 24;
            }
        }
        System.out.println(ansH + " " + ansM);
        sc.close();
    }
}
