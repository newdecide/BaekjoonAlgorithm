package javaalgo.j007_maxmin;

import java.util.Scanner;

public class j007_03_190927_sort {
    // 2920번

    // 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

    //연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] inputs = new int[8];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }
            sc.close();

            String output = "";
            for (int i = 0; i < inputs.length - 1; i++) {
                if (inputs[i] == inputs[i + 1] - 1) {
                    output = "ascending";
                } else if (inputs[i] == inputs[i + 1] + 1) {
                    output = "descending";
                } else {
                    output = "mixed";
                    break;
                }
            }
            System.out.println(output);
    }
}
