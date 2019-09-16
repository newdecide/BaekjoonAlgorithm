package kotlinalgo.k014_input

import java.util.*

fun main(args: Array<String>) {    
     // 9498번
        
     // 시험 점수를 입력받아
     // 90 ~ 100점은 A, 80 ~ 89점은
     // B, 70 ~ 79점은
     // C, 60 ~ 69점은
     // D, 나머지 점수는
     // F를 출력하는 프로그램을 작성하시오.
    
    var sc: Scanner = Scanner(System.`in`)
    var n: Int = sc.nextInt();

    if (n >= 90) {
        println("A")
    } else if (n >= 80){
            println("B")
    } else if (n >= 70){
        println("C")
    } else if (n >= 60) {
        println("D")
    } else {
        println("F")
    }
}
