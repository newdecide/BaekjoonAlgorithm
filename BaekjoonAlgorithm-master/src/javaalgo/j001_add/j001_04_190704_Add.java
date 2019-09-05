import java.util.Scanner;

public class j001_04_190704_Add {
    public static void main(String[] args) {
        // 10953번
        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분해서 계산한다.
        // 5
        // 1,1
        // 2
        // 2,3
        // 5
        // 3,4
        // 7
        // 9,8
        // 17
        // 5,2
        // 7
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s;
            s = sc.next();
            String[] arr = s.split(",");
            // 문자열을 정수형으로 변경
            System.out.println(Integer.parseInt(arr[0]) + (Integer.parseInt(arr[1])));
        }
    }
}
