package javaalgo.j014_input;

import java.util.Scanner;

public class j014_12_191019_input_num {
    // 11720번
    // 숫자의 합

    // 입력
    // 5
    // 54321

    // 출력
    // 15
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String inputs = sc.next();
        sc.close();

        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += inputs.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
