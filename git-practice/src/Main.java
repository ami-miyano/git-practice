import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args) {

        System.out.println("現在時間");

        //DateTimeFormatter不使用
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate);

        //DateTimeFormatter使用("yyyy/MM/dd HH:mm")
        DateTimeFormatter dtformat1 =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String fdate = dtformat1.format(nowDate);
        System.out.println(fdate);

        //DateTimeFormatter使用("yyyy年MM月dd日 HH時mm分")
        DateTimeFormatter dtformat2 =
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分");
        String fdate2 = dtformat2.format(nowDate);
        System.out.println(fdate2);
    }
}
