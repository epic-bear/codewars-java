package kata.kyu_7;

public class IsItNegativeZero {

    public static void main(String[] args) {
        System.out.println(isNegativeZero(0f));
    }

    public static boolean isNegativeZero(Float n) {
        return  n.equals(-0f);
    }
}
