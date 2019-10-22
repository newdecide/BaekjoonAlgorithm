package javaalgo.j012_wordlength;

import java.util.Arrays;
import java.util.Scanner;

public class j012_05_191021_AlphabetCount2 {
    // 10809번
    // 알파벳 찾기

    // 입력
    // helloworld

    // 출력
    // -1 -1 -1 9 1 -1 -1 0 -1 -1 -1 2 -1 -1 4 -1 -1 7 -1 -1 -1 -1 5 -1 -1 -1
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);

        for(int i=0; i<input.length(); i++) {
            char tmp = input.charAt(i);
            int index = input.indexOf(tmp);

            alpha[tmp-97] = index;
        }

        for(int i=0; i<alpha.length; i++)
            System.out.print((i != alpha.length-1) ? alpha[i] + " " : alpha[i]);

        s.close();
    }
}
