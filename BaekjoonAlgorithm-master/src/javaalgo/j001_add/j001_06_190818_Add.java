import java.util.Scanner;

public class j001_06_190818_Add {
  // 9085번
  // 10보다 작거나 같은 자연수 N개를 주면 합을 구하는 프로그램을 작성하시오.
  
  // 2
  // 5
  // 1 1 1 1 1
  // 7
  // 1 2 3 4 5 6 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tries;
        tries = sc.nextInt();

        for (int i = 0; i < tries; i++) {
            int a = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }

    }
}

