package kotlinalgo.k010_queue

import java.util.*

fun main(args: Array<String>) {
    // 1158번
    // 큐 조세퍼스 문제
    // 숫자 입력 n의 개수와 m씩 제거

    // 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다.
    // 이제 순서대로 M번째 사람을 제거한다.
    // 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
    // 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
    // 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다.
    // 예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

    val sc : Scanner = Scanner(System.`in`)
    val n = sc.nextInt();

    var jo :Queue<Int> = LinkedList()
    var jos : Queue<Int> = LinkedList()

    var m = sc.nextInt()

    for(i in 0 until n){
        jo.offer(i+1)
    }

    var count = 1;

    while(!jo.isEmpty()){
        // count%m을 하고 0일될때만 출력을 위한 큐에 넣어준다.
        if(count%m == 0){
            jos.offer(jo.poll())
        } else {
            jo.offer(jo.poll()) // 뺏다가 다시 넣으면 순서가 원래대로 돌아감.
        }
        count++
    }

    print("<"+jos.poll())
    while ((!jos.isEmpty())){
        print(", "+jos.poll())
    }
    print(">")


}