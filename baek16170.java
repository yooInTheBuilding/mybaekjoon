package practice_alone;


import java.time.LocalDate;
import java.time.ZoneId;


public class baek16170 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(ZoneId.of("UTC+0"));
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
    }
}
