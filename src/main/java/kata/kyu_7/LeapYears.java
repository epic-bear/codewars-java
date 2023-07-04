package kata.kyu_7;

public class LeapYears {

  public static void main(String[] args) {
    System.out.println(isLeapYear(2020));
  }

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0);
  }
}
