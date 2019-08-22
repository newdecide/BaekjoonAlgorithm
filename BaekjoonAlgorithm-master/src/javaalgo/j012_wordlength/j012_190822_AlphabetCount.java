package javaalgo.j012_wordlength;

import java.util.Scanner;

public class j012_190822_AlphabetCount {
    // 10808번
    // 알파벳 개수 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] cnt = new int[26];
        for (int i=0; i<s.length(); i++) {
            cnt[s.charAt(i) - 'a'] += 1;
        }
        for (int i=0; i<26; i++) {
            System.out.print(cnt[i] + " ");
        }
        System.out.println();
    }
}
