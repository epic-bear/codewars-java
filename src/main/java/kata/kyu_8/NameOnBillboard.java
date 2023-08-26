package kata.kyu_8;

public class NameOnBillboard {

  public static void main(String[] args) {
    System.out.println(billboard("Jeong-Ho Aristotelis", 30));
  }

  public static int billboard(String name, int price) {
    return Math.multiplyExact(name.length(), price);
  }
}
