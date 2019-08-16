import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    // 1924번

    // 2007년 1월 1일은 월요일이다.
    // 2007년 x월 y일은 몇요일일까?
    // 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
    // 빈칸으로 입력 구분 ex) 2 28 2월 28일의 요일은?

    // 년도
    val year = "2007"
    val sc : Scanner = Scanner(System.`in`)

    // 월과 일
    val m = sc.nextInt()
    val y = sc.nextInt()
    val date = year+"-"+m+"-"+y

    val dateFormat: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    val nDate: Date = dateFormat.parse(date)
    val cal : Calendar = Calendar.getInstance()
    cal.setTime(nDate)

    val dayNum = cal.get(Calendar.DAY_OF_WEEK)

    when(dayNum){
        1 -> System.out.println("SUN")
        2 -> System.out.println("MON")
        3 -> System.out.println("TUE")
        4 -> System.out.println("WED")
        5 -> System.out.println("THU")
        6 -> System.out.println("FRI")
        7 -> System.out.println("SAT")
    }
}

