package javaalgo.j007_maxmin;
import java.util.Scanner;

public class j007_01_190705_MaxMin {
    // 10818번
    // N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

    // 5 (n)
    // 20 10 35 30 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        int max = 0;
        int min = 999999;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            a[i] = num;

            if(max < a[i]){
                max = a[i];
            }
            if(min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min +" "+max);
    }
}
