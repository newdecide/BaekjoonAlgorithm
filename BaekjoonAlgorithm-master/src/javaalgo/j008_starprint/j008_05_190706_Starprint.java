package javaalgo.j008_starprint;
import java.util.Scanner;

public class j008_05_190706_Starprint {
    // 2442번
    // 별 찍기-5
    // 첫째 줄에 별 1개, 둘째 줄에 별 3개, ... N번째 줄에 별 2*N-1개 찍기
    //     *
    //    ***
    //   *****
    //  *******
    // *********

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(1 <= n && n <= 100){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n - i - 1; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k < 2 * i + 1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
