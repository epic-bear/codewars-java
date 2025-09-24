package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ZebulansNightmare {

  public static void main(String[] args) {
    System.out.println(zebulansNightmare("camel_case"));
  }

  public static String zebulansNightmare(final String functionName) {
    if (functionName.isEmpty()) {
      return functionName;
    }
    String result = Arrays.stream(functionName.split("_"))
        .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(
            Collectors.joining());
    return result.substring(0, 1).toLowerCase() + result.substring(1);
  }

}
