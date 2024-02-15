package kata.kyu_8;

public class RemoveTheMinimum {

    public static void main(String[] args) {
        System.out.println(multiply(-10));
    }

    public static int multiply(int number) {
        return (int) (number * Math.pow(5, String.valueOf(number).replaceAll("-", "").length()));
    }
}
