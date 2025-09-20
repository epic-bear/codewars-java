package kata.kyu_7;

import java.math.BigInteger;

public class FindingRemainderWithoutUsingOperator {

    public static void main(String[] args) {
        System.out.println(remainder(new SimpleInteger(34), new SimpleInteger(7)));
    }

    public static SimpleInteger remainder(SimpleInteger dividend, SimpleInteger divisor) {
        while (dividend.compareTo(divisor) >= 0) {
            dividend = dividend.subtract(divisor);
        }
        return dividend;
    }

    public static class SimpleInteger extends BigInteger {

        int value;

        public SimpleInteger(byte[] val, int off, int len) {
            super(val, off, len);
        }

        public SimpleInteger(int value) {
            super(String.valueOf(value));
            this.value = value;
        }

        public SimpleInteger subtract(SimpleInteger val) {
            this.value = this.value - val.intValue();
          return this;
        }
    }


}
