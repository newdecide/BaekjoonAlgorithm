package javaalgo.j008_starprint;
import java.util.Scanner;

public class j008_04_190705_Starprint {
    // 2441번
    // 별 찍기-4
    // 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
    // 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
    // *****
    //  ****
    //   ***
    //    **
    //     *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(1 <= n && n <= 100){
            for(int i = 0; i < n; i++){
                for(int k = 1; k <= i ; k++){
                    System.out.print(" ");
                }
                for(int j = n-i; j > 0; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
