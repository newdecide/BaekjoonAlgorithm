package javaalgo.j008_starprint;
import java.util.Scanner;

public class j008_03_190705_Starprint {
    public static void main(String[] args) {
        // 2440번
        // 별 찍기-3
        // 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
        // *****
        // ****
        // ***
        // **
        // *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(1 <= n && n <= 100){
            for(int i = 0; i <= n; i++){
                for(int j = n-i; j > 0; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
