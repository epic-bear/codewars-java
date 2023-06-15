package kata.kyu_7;

public class FindTheIndexOfTheSecondOccurrenceOfALetter {

  public static void main(String[] args) {
    System.out.println(secondSymbol("Hello world!!!", 'l'));
  }

  public static int secondSymbol(String str, char c) {
    return str.indexOf(c,str.indexOf(c)+1);
  }
}
