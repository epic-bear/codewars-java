package kata.kyu_7;

public class MinimumTicketCost {

    public static void main(String[] args) {
        System.out.println(findJane(778643));
    }

    public static int findJane(final int n) {
        return (n - 1) / 2;
    }
}
