package kata.kyu_7;

public class Friends {

    public static void main(String[] args) {
        System.out.println(friends(5));
    }

    public static int friends(int n) {
        int friend = 0;
        int max = 2;
        while (n > max) {
            friend++;
            max *= 2;
        }
        return friend;
    }
}
