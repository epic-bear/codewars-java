package kata.kyu_8;

public class CollatzCongecture {

    public static void main(String[] args) {
        System.out.println(hotpo(5));
    }

    public static int hotpo(int n) {
        int count = 0;
        while (n != 1) {
           n = n % 2 == 0 ? n / 2 : 3 * n + 1;
           count++;
        }
        return count;
    }
}
