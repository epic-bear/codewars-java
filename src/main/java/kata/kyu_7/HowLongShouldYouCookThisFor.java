package kata.kyu_7;

public class HowLongShouldYouCookThisFor {

    public static void main(String[] args) {
        System.out.println(getTime("7500W", 0, 5, "600W"));
    }

    public static String getTime(String neededPower, int minutes, int seconds, String power) {
        int nP = Integer.parseInt(neededPower.replace("W", ""));
        int p = Integer.parseInt(power.replace("W", ""));
        int time = (int) Math.ceil((minutes * 60 + seconds) * nP / (double) p);

        return String.format("%d minutes %d seconds",time / 60, time % 60);
    }
}
