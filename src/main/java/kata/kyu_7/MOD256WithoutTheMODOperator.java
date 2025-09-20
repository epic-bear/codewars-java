package kata.kyu_7;

public class MOD256WithoutTheMODOperator {

    public static void main(String[] args) {
        System.out.println(mod256WithoutMod(254));
    }

    public static int mod256WithoutMod(int number) {
        return number - 256 * (number / 256);
    }
}
