package kata.kyu_7;


public class SmoothNumbers {

    public static void main(String[] args) {
        System.out.println(isSmooth(16));
    }

    public static String isSmooth(long n) {
        int i = 2;
        while (n > 1 && i <= 7) {
            if (n % i == 0) {
                n = n / i;
            } else {
                i++;
            }
        }
        switch (i) {
            case 2:
                return "power of 2";
            case 3:
                return "3-smooth";
            case 5:
                return "Hamming number";
            case 7:
                return "humble number";
            default:
                return "non-smooth";
        }
    }
}
