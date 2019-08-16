package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_10_190716_Starprint {
    // 10991번
    // 별찍기 10
    // 1 -> *
    // 2 ->  *
    //      * *
    // 5 ->
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1부터 N까지 1씩 증가
        for(int i = 1; i <= n; i++){
            // i부터 n-1까지
            for(int j = i; j <= n - 1; j++){
                System.out.print(" ");
            }

            // 1부터 i*2까지
            for(int j = 1; j < i*2; j++){
                if(j % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
