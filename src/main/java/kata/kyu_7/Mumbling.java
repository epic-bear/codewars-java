package kata.kyu_7;

public class Mumbling {

  public static void main(String[] args) {
    System.out.println(accum("abcd"));
  }

  public static String accum(String s) {
    char[] arr = s.toCharArray();
    String result = "";

    for (int i = 0; i < arr.length; i++) {
      result += String.valueOf(arr[i]).toUpperCase() + String.valueOf(arr[i]).toLowerCase().repeat(i);
      result += "-";
    }
    return result.substring(0, result.length() - 1);
  }
}
