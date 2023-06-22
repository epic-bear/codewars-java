package kata.kyu_7;

public class BuildASquare {

  public static void main(String[] args) {
    System.out.println(generateShape(3));
  }

  public static String generateShape(int n) {
    return ("+".repeat(n) + "\n").repeat(n).trim();
  }
}
