package kata.kyu_7;

public class HolidayIIIFireOnTheBoat {

  public static void main(String[] args) {
    System.out.println(fireFight("Mast Deck Engine Water Fire"));
  }

  public static String fireFight(String s) {

    return s.replace("Fire", "~~");
  }
}
