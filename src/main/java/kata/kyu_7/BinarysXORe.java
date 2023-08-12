package kata.kyu_7;

import java.math.BigInteger;

public class BinarysXORe {

  public static void main(String[] args) {
    System.out.println(sxore(new BigInteger("1")));
  }

  public static BigInteger sxore (BigInteger n) {
    if (n.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)) return n;
    if (n.mod(BigInteger.valueOf(4)).equals(BigInteger.ONE)) return BigInteger.ONE;
    if (n.mod(BigInteger.valueOf(4)).equals(BigInteger.valueOf(2))) return n.add(BigInteger.ONE);
    return BigInteger.ZERO;
  }
}
