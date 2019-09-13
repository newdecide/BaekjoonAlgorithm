public class j014_190913_input_if {
       // 1330번
       // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		
		if(A>B) 
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else
			System.out.println("==");
	}
}
