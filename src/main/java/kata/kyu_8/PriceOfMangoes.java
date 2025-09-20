package kata.kyu_8;

public class PriceOfMangoes {

    public static void main(String[] args) {
        System.out.println(mango(3, 3));
    }

    public static int mango(int quantity, int price) {
        return (quantity - quantity / 3) * price;
    }
}
