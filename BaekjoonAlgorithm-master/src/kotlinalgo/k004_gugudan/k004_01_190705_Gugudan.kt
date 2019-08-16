import java.util.*

fun main(args: Array<String>) {
    // 2739번
    // 입력한 숫자의 단을 출력한다. 1단 씩 출력한다. 2를 입력하면 2단 출력
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()

    for(i in 1..9){
        println("$n * $i ="+n*i)
    }
}