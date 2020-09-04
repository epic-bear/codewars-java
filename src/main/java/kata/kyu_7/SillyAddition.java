package kata.kyu_7;

public class SillyAddition {

  public static int add(int num1, int num2) {

    StringBuilder builder = new StringBuilder();

    while (num1 + num2 != 0) {
      builder.insert(0, Integer.toString(num1 % 10 + num2 % 10));

      num1 /= 10;
      num2 /= 10;

    }
    if (builder.toString().equals("")){
      return 0;
    }
    else return Integer.parseInt(builder.toString());
  }
}
