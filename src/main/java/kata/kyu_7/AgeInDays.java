package kata.kyu_7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInDays {

    public static void main(String[] args) {
        System.out.println(ageInDays(2015, 11, 1));
    }

    public static String ageInDays(int year, int month, int day) {
        return String.format("You are %d days old",
                ChronoUnit.DAYS.between(LocalDate.of(year, month, day), LocalDate.now()));
    }
}
