package kata.kyu_7;

public class CyclopsNumbers {

  public static void main(String[] args) {
    System.out.println(cyclops(10));
  }

  public static boolean cyclops(long n) {
    String binary = Long.toBinaryString(n);
    if (binary.length() % 2 != 0) {
      if (binary.replaceAll("[0]", "").length() == binary.length() - 1) {
        return binary.charAt(binary.length() / 2) == '0';
      }
    }
    return false;
  }
}
