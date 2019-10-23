package javaalgo.j014_input;

import java.util.Scanner;

public class j014_13_191023_input_repeat {
    // 2675번
    // 문자열 반복
    // 입력
    // 2
    // 3 ABC
    // 5 /HTP
    // 출력
    // AAABBBCCC
    // /////HHHHHTTTTTPPPPP
    static int t, n;
    static String a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for(int tc=0; tc<t; tc++){
            n = in.nextInt();
            a = in.next();
            for(int i=0; i<a.length(); i++)
                for(int j=0; j<n; j++)
                    System.out.print(a.charAt(i));
            System.out.println();
        }
        in.close();
    }
}
