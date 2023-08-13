package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HelpSuzukiRakeHisGarden {

  public static void main(String[] args) {
    System.out.println(rakeGarden("slug spider rock gravel gravel gravel gravel gravel gravel gravel"));
  }

  public static String rakeGarden(String garden) {
    return Arrays.stream(garden.split(" "))
        .map(x -> x = !x.equals("gravel") && !x.equals("rock") ? "gravel" : x)
        .collect(Collectors.joining(" "));
  }
}
