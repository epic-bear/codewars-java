package kata.kyu_7;

public class DeodorantEvaporator {

  public static void main(String[] args) {
    System.out.println(evaporator(10, 10, 10));
  }

  public static int evaporator(double content, double evap_per_day, double threshold) {
    int count = 0;
    double thresholdMl = content * threshold / 100;
    while (content > thresholdMl) {
      count++;
      content = content - content * evap_per_day / 100;
    }
    return count;
  }
}
