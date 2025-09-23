package kata.kyu_7;

public class OdderThanTheRest {

  public static void main(String[] args) {
    System.out.println(oddOne(new int[]{2,4,6,7,10}));
  }

  public static int oddOne(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        return i;
      }
    }
    return -1;
  }
}
