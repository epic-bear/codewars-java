package kata.kyu_7;

import java.math.BigInteger;

public class AllNines {

    public static void main(String[] args) {
        System.out.println(allNines(new BigInteger("3989")));
    }

    public static BigInteger allNines(BigInteger x) {
        if (!x.testBit(0)) {
            return new BigInteger("-1");
        }
        BigInteger nine = BigInteger.valueOf(9);
        BigInteger nines = nine;
        for (int i = 0; i < 10000; i++) {
            if (nines.remainder(x).equals(BigInteger.ZERO)) {
                return nines.divide(x);
            } else {
                nines = nines.multiply(BigInteger.TEN).add(nine);
            }
        }
        return BigInteger.valueOf(-1);
    }
}
