package javaalgo.j014_input;

import java.util.Scanner;

public class j014_14_191025_input_wordcnt {
    // 1157번
    // 단어에서 가장 많이 사용된 알파벳
    // 여러개 존재하면 ? 출력

    // 입력
    // Mississipi
    // 출력
    // ?

    // zZa
    // Z

    // baaa
    // A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        int[] cnt = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 65]++;
            if (max < cnt[str.charAt(i) - 65]) {
                max = cnt[str.charAt(i) - 65];
                result = str.charAt(i);
            } else if (max == cnt[str.charAt(i) - 65]) {
                result = '?';
            }
        }
        System.out.println(result);

        sc.close();
    }
}
