package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_09_190715_Starprint {
    public static void main(String[] args) {
        // 2522번
        //     *
        //    **
        //   ***
        //  ****
        // *****
        //  ****
        //   ***
        //    **
        //     *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            for(int j = n-i; j > 0; j--)
                System.out.print(" ");
            for(int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++)
                System.out.print(" ");
            for(int k = n; k > i; k--)
                System.out.print("*");
            System.out.println();
        }
    }
}
