package javaalgo.j002_divide;

import java.io.*;
import java.util.*;

public class j002_04_191001_Divide {
    // 3052번
    // 나머지
    // 입력
    // 39
    // 40
    // 41
    // 42
    // 43
    // 44
    // 82
    // 83
    // 84
    // 85
    // 출력
    // 6
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] chk = new boolean[42];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            if (!chk[a % 42]) {
                chk[a % 42] = true;
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}