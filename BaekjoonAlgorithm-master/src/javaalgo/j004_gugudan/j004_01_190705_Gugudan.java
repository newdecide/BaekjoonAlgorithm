package javaalgo.j004_gugudan;
import java.util.Scanner;

public class j004_01_190705_Gugudan {
    // 2739번
    // 입력한 숫자의 단을 출력한다. 1단 씩 출력한다. 2를 입력하면 2단 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(n +"*"+ i + "=" + n * i);
        }
    }
}
