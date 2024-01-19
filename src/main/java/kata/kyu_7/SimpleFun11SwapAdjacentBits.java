package kata.kyu_7;

public class SimpleFun11SwapAdjacentBits {

    public static void main(String[] args) {
        System.out.println(swapAdjacentBits(74));
    }

    public static int swapAdjacentBits(int n) {
        return (n & 0xAAAAAAAA) >> 1 | (n & 0x55555555) << 1;
    }
}
