import java.util.*
import jdk.nashorn.internal.objects.Global.println
fun main(args: Array<String>) {
    // 2741번
    // 5 <- 입력
    // 1
    // 2
    // 3
    // 4
    // 5

    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    for (i in 1 .. n){
        println(i)
    }
}