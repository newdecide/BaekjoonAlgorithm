package javaalgo.j007_maxmin;

import java.util.Scanner;

public class j007_02_190925_Max {
    // 2562 번
    // 최대값 찾기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(sc.nextLine());
            if(max<a) {
                max = a;
                index = i+1;
            }
        }
        sb.append(max).append('\n').append(index);
        System.out.println(sb);
    }
}
