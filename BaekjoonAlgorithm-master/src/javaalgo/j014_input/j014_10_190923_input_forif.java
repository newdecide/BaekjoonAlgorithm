package javaalgo.j014_input;

import java.util.Scanner;

public class j014_10_190923_input_forif {
    // 10871번
    // x보다 작은 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < a.length; ++i) {
            if (a[i] < x) {
                System.out.print(a[i] + " ");
            }
        }
    }
}