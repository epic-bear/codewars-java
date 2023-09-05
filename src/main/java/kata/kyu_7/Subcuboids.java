package kata.kyu_7;

import java.math.BigInteger;
import static java.math.BigInteger.valueOf;

public class Subcuboids {

  public static void main(String[] args) {
    System.out.println(subcuboids(2, 2, 2));
  }

  public static BigInteger subcuboids(int x, int y, int z) {
    BigInteger bigX = valueOf(x).multiply(valueOf(x + 1));
    BigInteger bigY = valueOf(y).multiply(valueOf(y + 1));
    BigInteger bigZ = valueOf(z).multiply(valueOf(z + 1));
    return bigX.multiply(bigY).multiply(bigZ).divide(valueOf(8));
  }
}
