package kata.kyu_7;

public class NoIfsNoButs {
    public static void main(String[] args) {
        System.out.println(noIfsNoButs(5, 4));
    }

    public static String noIfsNoButs(int a, int b) {
        return switch (Integer.compare(a, b)) {
            case -1 -> String.format("%d is smaller than %d", a, b);
            case 1 -> String.format("%d is greater than %d", a, b);
            default -> String.format("%d is equal to %d", a, b);
        };
    }
}
