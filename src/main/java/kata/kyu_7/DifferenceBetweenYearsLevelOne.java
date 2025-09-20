package kata.kyu_7;

public class DifferenceBetweenYearsLevelOne {

    public static void main(String[] args) {
        System.out.println(howManyYears("2295/1/6", "1535/9/13"));
    }

    public static int howManyYears(String date1, String date2) {
        return Math.abs(Integer.parseInt(date1.substring(0, 4)) - Integer.parseInt(date2.substring(0, 4)));
    }
}
