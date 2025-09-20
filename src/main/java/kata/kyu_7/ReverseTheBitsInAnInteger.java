package kata.kyu_7;

public class ReverseTheBitsInAnInteger {

    public static void main(String[] args) {
        System.out.println(reverseBits(417));
    }

    public static int reverseBits(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }
}
