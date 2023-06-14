package kata.kyu_7;

public class EliminateTheIntruders {

  public static void main(String[] args) {
    System.out.println(eliminateUnsetBits(""));
  }

  public static long eliminateUnsetBits(String number) {
    number = number.replaceAll("0", "");
    return number.isEmpty() ? 0 : Long.parseLong(number, 2);
  }
}
