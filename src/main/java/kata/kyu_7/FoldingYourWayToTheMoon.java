package kata.kyu_7;

public class FoldingYourWayToTheMoon {

    public static void main(String[] args) {
        System.out.println(fold(384000000.0));
    }

    public static Long fold(Double distance) {
        long count = 0L;
        while (distance > 0.0001) {
            count++;
            distance /= 2;
            System.out.println(distance);
        }
        return distance < 0 ? null : count;
    }
}
