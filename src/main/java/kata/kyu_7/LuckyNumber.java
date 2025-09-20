package kata.kyu_7;


public class LuckyNumber {

    public static void main(String[] args) {
        System.out.println(isLucky(0));
    }

    public static boolean isLucky(long n) {
        return n % 9 == 0;
    }
}
