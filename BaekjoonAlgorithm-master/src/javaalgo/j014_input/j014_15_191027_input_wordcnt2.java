package javaalgo.j014_input;

import java.util.Scanner;

public class j014_15_191027_input_wordcnt2 {
    // 1152
    // 단어의 개수

    // 입력
    // 출력
    // The Curious Case of Benjamin Button
    // 6

    // Mazatneunde Wae Teullyeoyo
    // 3

    // Teullinika Teullyeotzi
    // 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        sc.close();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
    }
}
