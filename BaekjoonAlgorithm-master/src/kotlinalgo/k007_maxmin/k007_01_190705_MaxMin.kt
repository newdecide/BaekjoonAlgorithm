import java.util.*

fun main(args: Array<String>) {
    // 10818번
    // N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

    // 5 (n)
    // 20 10 35 30 7

    val sc:Scanner = Scanner(System.`in`)
    val n = sc.nextInt()

    var max = 0
    var min = 999999

    var arr = Array(n, {0})

    for (i in 0 .. n-1){
        var num = sc.nextInt()
        arr[i] = num

        if(max < arr[i]){
            max = arr[i]
        }

        if(min > arr[i]){
            min = arr[i]
        }
    }
    println("$max , $min")
}