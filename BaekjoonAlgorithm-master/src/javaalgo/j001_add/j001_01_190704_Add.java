import java.util.Scanner;

public class j001_01_190704_Add {
    // 1000번
    // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    // psvma 스니팻
    public static void main(String[] args) {

        // A와 B는 0보다 크고 10보다 작아야 한다.
        // 스캐너 클래스 객체 생성 후 사용
        Scanner sc = new Scanner(System.in);
        // 입력 받을 변수 선언
        int a, b;
        // 총 2번의 입력을 하고 시작
        // 변수에 입력후 다음 값 입력
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);

        // 스니팻 정리
        // soutp
        System.out.println("args = [" + args + "]");
        // sout
        System.out.println();
        // souf
        System.out.printf("");
        // soutm
        System.out.println("Add1.main");
        // soutv
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
