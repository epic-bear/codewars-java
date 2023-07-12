package kata.kyu_7;

public class AerialFirefighting {

  public static void main(String[] args) {
    System.out.println(waterbombs("xxxxxYxYx", 4));
  }

  public static int waterbombs(String fire, int w) {
    String[] strings = fire.split("Y");
    int count = 0;
    for (String string : strings) {
      count += string.length() / w;
      if (string.length() % w > 0) {
        count += 1;
      }
    }
    return count;
  }
}
