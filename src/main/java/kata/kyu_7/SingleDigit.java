package kata.kyu_7;

public class SingleDigit {

    public static void main(String[] args) {
        System.out.println(singleDigit(5));
    }

    static int singleDigit(int n) {
        while (n > 9) {
            n = Integer.toBinaryString(n).replaceAll("0", "").length();
        }
        return n;
    }
}
