package javaalgo.j014_input;

import java.util.Scanner;

public class j014_09_190921_input_twonum {
    public static void main(String[] args) {
        // 10817번
        // 세 가지 수 중 2번째 수

        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        int tmp = 0;

        for (int i = 0; i < 3; i++){
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(num[i] > num[j]){
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }

        // 2번째 배열 출력
        System.out.println(num[1]);



    }
}
