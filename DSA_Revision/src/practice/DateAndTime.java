package practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        today = today.plusYears(1).plusMonths(2).plusDays(2);
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
