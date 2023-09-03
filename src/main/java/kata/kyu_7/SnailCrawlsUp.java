package kata.kyu_7;

public class SnailCrawlsUp {

  public static void main(String[] args) {
    System.out.println(snail(10, 3, 1));
  }

  public static int snail(int column, int day, int night) {
    if (day > column) {
      return 1;
    }
    return (column - night - 1) / (day - night) + 1;
  }
}
