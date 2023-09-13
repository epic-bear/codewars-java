package kata.kyu_7;

public class DontGiveMeFive {

  public static void main(String[] args) {
    System.out.println(dontGiveMeFive(1, 9));
  }

  public static int dontGiveMeFive(int start, int end) {
    int count = 0;
    for (int i = start; i <= end; i++) {
      if (String.valueOf(i).contains("5")) {
        continue;
      }
      count++;
    }
    return count;
  }
}
