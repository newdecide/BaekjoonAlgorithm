package javaalgo.j006_nsum;

import java.util.Scanner;

public class j006_02_190929_CntSum {
    // 2577번
    // 150
    // 266
    // 427
    // 3
    // 1
    // 0
    // 2
    // 0
    // 0
    // 0
    // 2
    // 0
    // 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int[] counts = new int[10];
        int number = A * B * C;
        while (number > 0) {
            counts[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}
