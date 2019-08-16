package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_08_190715_Starprint {
    public static void main(String[] args) {
        // 별찍기-9
        // 2446
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++)
                System.out.print(" ");
            for(int k = (n*2)-((i+1)*2); k >= 0; k--)
                System.out.print("*");
            for(int j = i; j > 1; j--)
                System.out.print(" ");
            System.out.println();
        }

        for(int i = n-1; i > 0; i--){
            for(int j = i; j > 1; j--)
                System.out.print(" ");
            for(int k = 0; k <= 2*(n-i); k++)
                System.out.print("*");
            for(int j = i; j > 1; j--)
                System.out.print(" ");
            System.out.println();
        }

    }
}
