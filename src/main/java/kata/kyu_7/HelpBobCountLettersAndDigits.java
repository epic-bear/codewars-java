package kata.kyu_7;


public class HelpBobCountLettersAndDigits {

  public static void main(String[] args) {
    System.out.println(countLettersAndDigits("hel2!lo"));
  }

  public static int countLettersAndDigits(String input){
    return input.replaceAll("[^A-Za-z0-9]", "").length();
  }
}
