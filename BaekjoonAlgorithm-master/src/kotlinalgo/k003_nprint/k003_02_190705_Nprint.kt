import java.util.*
import jdk.nashorn.internal.objects.Global.println
fun main(args: Array<String>) {
    // 2742번
    // 5 <- 입력
    // 5
    // 4
    // 3
    // 2
    // 1
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()

    for( i in n downTo 1){
        println(i)
    }
}