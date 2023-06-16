package kata.kyu_7;

public class ExesAndOhs {

  public static void main(String[] args) {
    System.out.println(getXO("ooxx"));
  }

  public static boolean getXO (String str) {
     return str.replaceAll("[^xX]","").length() == str.replaceAll("[^oO]","").length();
  }
}
