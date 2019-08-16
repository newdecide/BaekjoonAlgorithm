package javaalgo.j001_add;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class j001_05_190816_Add {
    // 1110번
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int cnt=1;
            int chk = num;
            while(true){
                int a = num/10;
                int b = num%10;
                int c = a + b;
                num = b*10 + c%10;

                if(num==chk)
                    break;
                else{
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

}
