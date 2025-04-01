package kata.kyu_8;

public class SumTheStrings {

    public static void main(String[] args) {
        System.out.println(sumStr("4", "5"));
    }

    public static String sumStr(String a, String b) {
        return String.valueOf(Integer.parseInt(a.isEmpty() ? "0" : a) + Integer.parseInt(b.isEmpty() ? "0" : b));
    }
}
