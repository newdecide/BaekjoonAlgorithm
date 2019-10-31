package kotlinalgo.k014_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j014_17_191031_input_dial {
    // 5622번
    // 다이얼 전화기

    // 입력
    // UNUCIC
    // 출력
    // 36
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] dials = br.readLine().toCharArray();
        int sum = 0;
        for (char c : dials) {
            sum += 2;
            switch (c) {
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 1;
                case 'T':
                case 'U':
                case 'V':
                    sum += 1;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum += 1;
                case 'M':
                case 'N':
                case 'O':
                    sum += 1;
                case 'J':
                case 'K':
                case 'L':
                    sum += 1;
                case 'G':
                case 'H':
                case 'I':
                    sum += 1;
                case 'D':
                case 'E':
                case 'F':
                    sum += 1;
                case 'A':
                case 'B':
                case 'C':
                    sum += 1;
            }
        }
        System.out.println(sum);

    }


}
