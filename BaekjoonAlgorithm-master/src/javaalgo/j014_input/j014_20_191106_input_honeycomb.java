package javaalgo.j014_input;

import java.util.Scanner;

public class j014_20_191106_input_honeycomb {
    // 2292번
    // 벌집
    // 6각형으로 이루어진 벌집의 중심

    // 입출력
    // 13 -> 3, 58 -> 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rslt = 1;
        int roomNum = 1;
        int addNum = 6;
        while(true) {
            if(n <= roomNum) {
                break;
            }
            roomNum += addNum;
            addNum += 6;
            rslt++;
        }

        System.out.println(rslt);
    }
}
