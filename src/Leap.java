import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;

public class Leap {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1985,7,17);


        System.out.println("Day of year " + birthday.getDayOfYear());
        System.out.println("Day of month " + birthday.getDayOfMonth());
        System.out.println("month of day " + birthday.getMonth());
        System.out.println("Day of week " + birthday.getDayOfWeek());
        System.out.println("Leap year " + birthday.isLeapYear());
        System.out.println(birthday);
        LocalTime timeTest = LocalTime.now();
        System.out.println(timeTest);
        System.out.println(timeTest.getHour());
    }
}

