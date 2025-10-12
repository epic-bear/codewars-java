package kata.kyu_7;

public class FindTheSmallestPowerHigherThanAGivenAValue {
    public static void main(String[] args) {
        System.out.println(findNextPower(12385, 3));
    }

    public static int findNextPower(int val, int pow_) {
        return (int) Math.pow(Math.ceil(Math.pow(val, 1. / pow_ )), pow_);
    }
}
