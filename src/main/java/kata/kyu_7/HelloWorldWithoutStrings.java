package kata.kyu_7;


public class HelloWorldWithoutStrings {

  public static void main(String[] args) {
    System.out.println(helloWorld());
  }

  public static String helloWorld() {
    char[] charArray = new char[]{72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
    return new String(charArray);
  }
}
