package kata.kyu_7;

import java.util.Arrays;

public class ArrayElementParity {

  public static void main(String[] args) {
    System.out.println(solve(new int[]{-9, -105, -9, -9, -9, -9, 105}));
  }

  public static int solve(int [] arr){
   return Arrays.stream(arr).distinct().sum();
  }
}
