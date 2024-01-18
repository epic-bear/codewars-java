package kata.kyu_7;

public class AllStarCodeChallenge22 {

    public static void main(String[] args) {
        System.out.println(toTime(3600));
    }

    public static String toTime(int seconds){
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;

        return String.format("%d hour(s) and %d minute(s)", hours, minutes);
    }
}
