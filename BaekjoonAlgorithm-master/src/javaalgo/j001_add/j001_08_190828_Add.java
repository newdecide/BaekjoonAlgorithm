package javaalgo.j001_add;

import java.util.Scanner;

public class j001_08_190828_Add {
    // 11869번
    // 사칙연산
    // 1 10
    // 11
    // -9
    // 10
    // 0
    // 1
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
    }
}
