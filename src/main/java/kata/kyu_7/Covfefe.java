package kata.kyu_7;


public class Covfefe {

  public static void main(String[] args) {
    System.out.println(covfefe("coverage"));
  }

  public static String covfefe(String tweet) {
      return tweet.contains("coverage") ? tweet.replaceAll("coverage", "covfefe") :
          tweet.concat(" covfefe");
  }
}
