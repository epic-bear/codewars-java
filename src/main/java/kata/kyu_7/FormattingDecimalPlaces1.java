package kata.kyu_7;

public class FormattingDecimalPlaces1 {

    public static void main(String[] args) {
        System.out.println(twoDecimalPlaces(32.8493));
    }

    public static double twoDecimalPlaces(double number) {
        return (int) (number * 100) / 100.;
    }
}
