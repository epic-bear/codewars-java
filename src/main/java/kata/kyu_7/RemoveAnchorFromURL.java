package kata.kyu_7;

public class RemoveAnchorFromURL {

  public static void main(String[] args) {
    System.out.println(removeUrlAnchor("https://example.com#section1"));
  }

  public static String removeUrlAnchor(String url) {
    return url.split("#")[0];
  }
}
