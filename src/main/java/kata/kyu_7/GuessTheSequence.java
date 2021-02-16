package kata.kyu_7;


import java.util.stream.IntStream;

public class GuessTheSequence {

  public static void main(String[] args) {

  }

  public static int[] getSequence(int a) {

    return IntStream.rangeClosed(1, a)
        .mapToObj(Integer::toString).sorted().mapToInt(Integer::parseInt).toArray();
  }
}
