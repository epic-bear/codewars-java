package kata.kyu_7;

public class SimpleBeadsCount {

    public static void main(String[] args) {
        System.out.println(countRedBeads(6));
    }

    public static int countRedBeads(final int nBlue) {
        return nBlue <= 1 ? 0 : (nBlue - 1) * 2;
    }
}
