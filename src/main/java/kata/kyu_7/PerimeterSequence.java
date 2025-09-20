package kata.kyu_7;

public class PerimeterSequence {

    public static void main(String[] args) {
        System.out.println(perimeterSequence(1, 3));
    }

    public static int perimeterSequence(int a, int n){
        return a * 4 * n;
    }
}
