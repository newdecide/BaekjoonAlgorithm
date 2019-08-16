package javaalgo.j005_week;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class j005_01_190705_Week {
    public static void main(String[] args) throws ParseException {
        // 1924번

        // 2007년 1월 1일은 월요일이다.
        // 2007년 x월 y일은 몇요일일까?
        // 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
        // 빈칸으로 입력 구분 ex) 2 28 2월 28일의 요일은?

        // 년도
        String year = "2007";
        Scanner sc = new Scanner(System.in);

        // 월과 일 입력
        String m = String.valueOf(sc.nextInt());
        String d = String.valueOf(sc.nextInt());
        String day = "";

        String date = year + "-" +m + "-" +d;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date nDate = dateFormat.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(nDate);

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);

        switch (dayNum) {
            case 1:
                System.out.println("SUN");
                break;
            case 2:
                System.out.println("MON");
                break;
            case 3:
                System.out.println("TUE");
                break;
            case 4:
                System.out.println("WED");
                break;
            case 5:
                System.out.println("THU");
                break;
            case 6:
                System.out.println("FRI");
                break;
            case 7:
                System.out.println("SAT");
                break;

        }
    }
}
