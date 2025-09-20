package kata.kyu_7;

import java.util.Arrays;

public class LongestVowelChain {

    public static void main(String[] args) {
        System.out.println(solve("ultrarevolutionariees"));
    }

    public static int solve(String s){
      return Arrays.stream(s.split("[^aeiou]"))
              .mapToInt(String::length)
              .max()
              .orElse(0);
    }
}
