package javaalgo.j011_deque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class j011_190725_deque {
// 10866번
// 데큐 문제

// 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
// 명령은 총 여덟 가지이다.
// push_front X: 정수 X를 덱의 앞에 넣는다.
// push_back X: 정수 X를 덱의 뒤에 넣는다.
// pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 덱에 들어있는 정수의 개수를 출력한다.
// empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
// front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // deque 객체 생성
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            // line의 공백 제거
            String[] s = line.split(" ");

            String cmd = s[0];

            // 덱의 앞에 넣는다.
            if (cmd.equals("push_front")) {
                int num = Integer.parseInt(s[1]);
                deque.offerFirst(num);
            // 덱에 뒤에 넣는다.
            } else if (cmd.equals("push_back")) {
                int num = Integer.parseInt(s[1]);
                deque.offerLast(num);
            // 덱의 가장 앞에 있는 정수 출력
            } else if (cmd.equals("front")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.peekFirst());
                }
            // 덱의 정수의 개수 출력
            } else if (cmd.equals("size")) {
                System.out.println(deque.size());
            // 덱이 비어있으면 1을 아니면 0 출력
            } else if (cmd.equals("empty")) {
                if (deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            // 덱의 가장 앞에 있는 수를 빼고 그수를 출력 없는 경우 -1 출력
            } else if (cmd.equals("pop_front")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.pollFirst());
                }
            // 덱의 가장 뒤에 있는 수를 빼고 그 수 출력 없는 경우 -1 출력
            } else if (cmd.equals("pop_back")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.pollLast());
                }
            // 덱의 가장 뒤에 있는 정수 출력
            } else if (cmd.equals("back")) {
                if (deque.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}
    /*
    *   15
        push_back 1
        push_front 2
        front
        back
        size
        empty
        pop_front
        pop_back
        pop_front
        size
        empty
        pop_back
        push_front 3
        empty
        front
    *
    *
    *   결과
    *   2
        1
        2
        0
        2
        1
        -1
        0
        1
        -1
        0
        3
    * */