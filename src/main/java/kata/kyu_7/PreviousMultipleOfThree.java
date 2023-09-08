package kata.kyu_7;

public class PreviousMultipleOfThree {

  public static void main(String[] args) {
    System.out.println(prevMultOfThree(36));
  }

  public static Integer prevMultOfThree(int n) {
    while (n > 0) {
      if (n % 3 == 0) {
        return n;
      }
      n = n / 10;
    }
    return null;
  }
}
