package javaalgo.j014_input;

import java.util.Scanner;

public class j014_16_191029_input_constant {
    // 2908번
    // 상수

    // 입력
    // 734 893
    // 출력
    // 437
    // 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734과 893을 칠판에 적었다면,
    // 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(revNum(a) > revNum(b) ? revNum(a): revNum(b));
    }

    public static int revNum(int num){
        return 100*(num%10)+ 10*(num/10%10)+num/100;
    }
}
