package kata.kyu_7;

import java.math.BigInteger;

public class MathPow {

    public static void main(String[] args) {
        System.out.println(pow(new BigInteger("2"), new BigInteger("3")));
    }

    public static BigInteger pow(BigInteger base, BigInteger exponent) {
        if (exponent.intValue() < 1) {
            return new BigInteger("-1");
        }
        while (exponent.compareTo(new BigInteger("1")) > 0) {
            base = base.pow(2);
            exponent = exponent.subtract(new BigInteger("1"));
        }
        return base;
    }
}
