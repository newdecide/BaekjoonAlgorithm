package kotlinalgo.k001_add

private val check = BooleanArray(10000)
// 4673번
// 셀프넘버
// 자기자신과 자리수만큼 더한다.
// 1
// 3
// 5
// 7
// 9
// 20
// 31
// 42
// 53
// 64
//  |
//  |       <-- a lot more numbers
//  |
// 9903
// 9914
// 9925
// 9927
// 9938
// 9949
// 9960
// 9971
// 9982
// 9993
fun main(args: Array<String>) {
    var i: Int
    i = 1
    while (i < 10000) {
        d(i)
        i++
    }

    i = 1
    while (i < 10000) {
        if (!check[i]) {
            println(i)
        }
        i++
    }
}

private fun d(n: Int): Int {
    var sum = 0
    if (n < 10) {
        // 1의자리
        sum = 2 * n
        check[sum] = true

    } else if ((n >= 10) and (n < 100)) {
        // 10의 자리
        val num = IntArray(2) // 33
        num[0] = n / 10 // 3
        num[1] = n % 10 // 3
        sum = n + num[0] + num[1] // 33 + 3 + 3 = 39
        check[sum] = true

    } else if ((n >= 100) and (n < 1000)) {
        // 100의 자리
        val num = IntArray(3) // 120
        num[0] = n / 100 // 1
        num[1] = n % 100 / 10 // 2
        num[2] = n % 10 // 0
        sum = n + num[0] + num[1] + num[2] // 120 + 1 + 2 + 0 = 123
        check[sum] = true

    } else if ((n >= 1000) and (n < 10000)) {
        // 1000의 자리
        val num = IntArray(4) // 9913
        num[0] = n / 1000 // 9
        num[1] = n % 1000 / 100 // 9
        num[2] = n % 100 / 10 // 1
        num[3] = n % 10 // 3
        sum = n + num[0] + num[1] + num[2] + num[3] // 9913 + 9 + 9 + 1 + 3 = 9935
        if (sum >= 10000) {
            return 0
        }
        check[sum] = true

    } else {
        return 0
    }
    return d(sum)
}
