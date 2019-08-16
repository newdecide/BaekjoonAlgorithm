package javaalgo.j003_nprint;

import java.util.Scanner;

public class j003_02_190705_Nprint {
    // 2742번
    // 5
    // 5
    // 4
    // 3
    // 2
    // 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i-- ){
            System.out.println(i);
        }
    }
}
