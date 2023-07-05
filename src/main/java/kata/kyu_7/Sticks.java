package kata.kyu_7;

public class Sticks {

  public static void main(String[] args) {
    System.out.println(makeMove(3));
  }

  public static int makeMove(int sticks) {
    return sticks % 4;
  }
}
