package kata.kyu_7;

public class SwappingCards {

    public static void main(String[] args) {
        System.out.println(swapCards(41, 98));
    }

    public static boolean swapCards(int n1, int n2) {
        int lowestNumber = Math.min(n1 / 10, n1 % 10);
        int tensDigit = n2 / 10;
        return lowestNumber * 10 + n2 % 10 <
                (lowestNumber == n1 / 10 ? tensDigit * 10 + n1 % 10 : n1 / 10 * 10 + tensDigit);
    }
}
