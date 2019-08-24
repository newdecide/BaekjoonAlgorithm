package javaalgo.j012_wordlength;

import java.util.Scanner;

public class j012_190824_AlphabetSearch {
    // 10809번
    // 알파벳 찾기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray(); // 입력 받은 문자열을 배열을 생성후 한 글자씩 배정.

        int[] result_arr = whereisAlpha(arr);

        for (int i = 0; i < result_arr.length; i++) {
            System.out.print(result_arr[i] + " ");
        }
    }

    static int[] whereisAlpha(char[] arr) {

        int[] location = new int[26]; // 알파벳 총 26자의 위치 정보를 저장하기 위한 배열.
        int locate;

        for (int i = 0; i <= 25; i++) { // 모든 알파벳을 탐색하기 위한 반복문.
            char alphabet = (char) (i + 97); // 97(아스키코드로 a)부터 강제 형변환 시켜주어 문자를 대입.
            for (int j = 0; j < arr.length; j++) { // 문자열을 담은 배열에 해당 알파벳이 있는지 검사.
                if (arr[j] == alphabet) {
                    location[i] = j; // 같다면 배열 location에 해당 알파벳이 있던 위치 정보를 대입.
                    break;
                } else if (j == arr.length - 1 && arr[j] != alphabet) { // 문자열을 끝까지 탐색했으나 해당 알파벳이 없으면,
                    location[i] = -1; // -1을 대입.
                }
            }
        }
        return location;
    }
}
