package kata.kyu_7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {

    public static void main(String[] args) {
        System.out.println(unluckyDays(2015));
    }

    public static int unluckyDays(int year) {
        int answer = 0;

        for (int m = 1; m <= 12; m++)
            if (LocalDate.of(year, m, 13).getDayOfWeek() == DayOfWeek.FRIDAY)
                answer++;

        return answer;
    }
}
