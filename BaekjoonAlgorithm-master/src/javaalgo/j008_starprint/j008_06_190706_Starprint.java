package javaalgo.j008_starprint;
import java.util.Scanner;

public class j008_06_190706_Starprint {
    // 2444번
    // 별 찍기-7
    //    *
    //   ***
    //  *****
    // *******
    //*********
    // *******
    //  *****
    //   ***
    //    *
    public static void main(String[] args) {
        // 2444번
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(1 <= n && n <= 100){
            // 0 -> 1 -> 2 -> 3
            for(int i = 0; i < n; i++){
                // 4 -> 3 -> 2 -> 1
                for(int j = 0; j < n - i - 1; j++){
                    System.out.print(" ");
                }
                // 1 -> 3 -> 5 -> 7 -> 9
                for(int k = 0; k < 2 * i + 1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i = n-1; i > 0; i--){
                // 1 -> 2 -> 3 -> 4
                for(int j = 0; j < n - i; j++){
                    System.out.print(" ");
                }
                // 7 -> 5 -> 3 -> 1
                for(int k = 2 * i - 1; k > 0 ; k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
