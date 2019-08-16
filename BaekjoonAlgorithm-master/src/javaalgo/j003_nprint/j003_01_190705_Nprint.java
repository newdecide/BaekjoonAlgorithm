package javaalgo.j003_nprint;
import java.util.Scanner;

public class j003_01_190705_Nprint {
    // 2741
    // 5 <- 입력
    // 1
    // 2
    // 3
    // 4
    // 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
