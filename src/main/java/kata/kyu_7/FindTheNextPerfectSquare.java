package kata.kyu_7;

public class FindTheNextPerfectSquare {

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
    }

    public static long findNextSquare(long sq) {
        return Math.sqrt(sq) % 1 == 0 ? (long) Math.pow(Math.sqrt(sq) + 1, 2) : -1;
    }
}
