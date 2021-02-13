package kata.kyu_8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableForNumber {

  public static void main(String[] args) {

    
  }

  public static String multiTable(int num){

    return IntStream.rangeClosed(1, 10)
        .mapToObj(i -> i + " * " + num + " = " + i * num)
        .collect(Collectors.joining("\n"));
  }
}
