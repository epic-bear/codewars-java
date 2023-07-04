package kata.kyu_7;

public class ExcelSheetColumnNumbers {

  public static void main(String[] args) {
    System.out.println(titleToNumber("BA"));
  }

  public static long titleToNumber(String title) {
    char[] chars = title.toCharArray();
    long result = 0L;
    for (char c : chars) {
      result = result * 26 + (int) c - 64;
    }
    return result;
  }
}
