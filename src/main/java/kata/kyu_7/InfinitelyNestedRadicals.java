package kata.kyu_7;

public class InfinitelyNestedRadicals {

    public static void main(String[] args) {
        System.out.println(evaluateFunction(2));
    }

    public static double evaluateFunction(int x) {
        return (1 + Math.sqrt(1 + 4 * (long) x)) / 2;
    }
}
