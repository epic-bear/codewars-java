package kata.kyu_7;

public class CircleOfNumbers {

    public static void main(String[] args) {
        System.out.println(circleOfNumbers(10, 2));
    }

    public static int circleOfNumbers(int n, int firstNumber) {
        return (firstNumber + n / 2) % n;
    }
}
