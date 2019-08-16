import java.util.*
import jdk.nashorn.internal.objects.Global.println
fun main(args: Array<String>) {
    // 1008번
    // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextFloat()
    var b = sc.nextFloat()

    println(a/b)

}