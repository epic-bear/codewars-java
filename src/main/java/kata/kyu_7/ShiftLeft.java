package kata.kyu_7;

public class ShiftLeft {

    public static void main(String[] args) {
        System.out.println(shiftLeft("test", "west"));
    }

    public static int shiftLeft(String a, String b) {
        int index = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(a.length() - 1 - i) == b.charAt(b.length() - 1 - i)) {
                index++;
            } else {
                break;
            }
        }
        return a.length() + b.length() - index * 2;
    }
}
