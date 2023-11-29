package kata.kyu_7;

import java.time.LocalDate;

public class DayOfTheYear {

    public static void main(String[] args) {
        System.out.println(toDayOfYear(new int[]{31,  12, 2003}));
    }

    public static int toDayOfYear(int[] date){
        return LocalDate.of(date[2], date[1], date[0]).getDayOfYear();
    }
}
