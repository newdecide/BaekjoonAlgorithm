package javaalgo.j001_add;

import java.util.Scanner;

public class j001_09_190830_Add {
    // 2588번
    
    // 곱셈연산
    //    472
    //  x 385
    //   2360
    //  3776
    // 1416
    // 181720

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        solve(num1, num2);
        sc.close();
    }

    private static void solve(int num1, int num2) {
        int temp = num2;
        while (temp > 0) {
            System.out.println(num1 * (temp % 10));
            temp /= 10;
        }
        System.out.println(num1 * num2);
    }
}
