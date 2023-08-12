package kata.kyu_7;

import java.math.BigInteger;

public class BinaryScORe {

  public static void main(String[] args) {
    System.out.println(score(new BigInteger("1000000")));
  }

  public static BigInteger score(BigInteger n) {
    return n.equals(BigInteger.ZERO) ? BigInteger.ZERO :
        BigInteger.ONE.shiftLeft(BigInteger.valueOf(n.bitLength()).intValue())
            .subtract(BigInteger.ONE);
  }
}
