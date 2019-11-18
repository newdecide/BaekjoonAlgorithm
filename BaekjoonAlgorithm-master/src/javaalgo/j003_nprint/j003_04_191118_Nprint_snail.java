package javaalgo.j003_nprint;

import java.util.Scanner;

public class j003_04_191118_Nprint_snail {
    // 2869번
    // 달팽이는 올라가고 싶다.

    // 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
    // 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
    // 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

    // 입력: 2 1 5
    // 츌룍 4
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long V = in.nextLong();
        long answer = 0;
        long dis = A-B;

        V -= B;
        answer = V / dis;
        if(V % dis > 0)
            answer++;

        System.out.println(answer);
    }
}
