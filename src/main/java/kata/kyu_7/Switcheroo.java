package kata.kyu_7;

public class Switcheroo {

  public static void main(String[] args) {
    System.out.println(switcheroo("bbbacccabbb"));
  }

  public static String switcheroo(String x) {
    return x.replace("a", "X").replace("b", "a").replace("X", "b");
  }
}
