package kata.kyu_7;

public class ConvertTimeToString {

    public static void main(String[] args) {
        System.out.println(convertTime(-90061));
    }

    public static String convertTime(int timeDiff) {
        int days = timeDiff / 86400;
        timeDiff -= days * 86400;
        int hours = timeDiff / 3600;
        timeDiff -= hours * 3600;
        int minutes = timeDiff / 60;
        int seconds = timeDiff - minutes * 60;
        return String.format("%d %d %d %d", days, hours, minutes, seconds);
    }
}
