package kata.kyu_7;

public class BatmanQuotes {

  public static void main(String[] args) {
    System.out.println(getQuote(new String[]{ "Quote Hidden in example test",
        "Holy haberdashery, Batman!",
        "Quote Hidden in example test"
    }, "Rob1n"));
  }

  public static String getQuote(String[] quotes, String hero){
    String quote = quotes[Integer.parseInt(hero.replaceAll("[A-Za-z]", ""))];
    hero = hero.charAt(0) == 'B' ? "Batman" : hero.charAt(0) == 'R' ? "Robin" : "Joker";
    return hero + ": " + quote;
  }
}
