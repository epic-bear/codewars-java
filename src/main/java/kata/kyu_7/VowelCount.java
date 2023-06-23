package kata.kyu_7;

public class VowelCount {

  public static void main(String[] args) {
    System.out.println(getCount("abracadabra"));
  }

  public static int getCount(String str) {

    return str.replaceAll("[^aeiou]", "").length();
  }
}
