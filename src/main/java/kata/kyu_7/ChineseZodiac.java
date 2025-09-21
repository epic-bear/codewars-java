package kata.kyu_7;

import java.util.List;

public class ChineseZodiac {

  private static final int INITIATION_YEAR = 1924;
  private static final List<String> ANIMALS = List
      .of("Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster",
          "Dog", "Pig");
  private static final List<String> ELEMENTS = List
      .of("Wood", "Fire", "Earth", "Metal", "Water");

  public static void main(String[] args) {
    System.out.println(chineseZodiac(4453));
  }

  public static String chineseZodiac(int year) {
    String animal = ANIMALS.get((year - INITIATION_YEAR) % 12);
    String element = ELEMENTS.get((year - INITIATION_YEAR) / 2 % 5);
    return element + " " + animal;
  }
}
