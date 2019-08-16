package javaalgo.j008_starprint;

import java.util.Scanner;

public class j008_11_190716_Starprint {
    // 별찍기-17
    // 10992번
    // 5
    //     *
    //    * *
    //   *   *
    //  *     *
    // *********

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n+i-1; j++){
                if (j==n+i-1) {
                    // 라인의 마지막 별 출력
                    System.out.print("*");
                } else if(i>1 && n-i+1 == j){
                    // 라인의 첫번째 별 출력
                    System.out.print("*");
                } else if(i == n) {
                    // 마지막 라인 별 출력
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
