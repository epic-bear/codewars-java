package kata.kyu_8;

public class BASICMakingSixToast {

    public static void main(String[] args) {
        System.out.println(sixToast(5));
    }

    public static int sixToast(int num) {
        return Math.abs(6 - num);
    }
}
