package kata.kyu_7;

public class EasyWallpaper {

  public static void main(String[] args) {
    System.out.println(wallpaper(6.3, 4.5, 3.29));
  }

  public static String wallpaper(double l, double w, double h) {
    String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine", "ten", "eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

    return l * w * h == 0 ? numbers[0] : numbers[(int) Math.ceil(((l * h + w * h) / 2.6) * 1.15)];
  }
}
