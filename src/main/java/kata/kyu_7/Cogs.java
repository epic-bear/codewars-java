package kata.kyu_7;

public class Cogs {

  public static void main(String[] args) {
    System.out.println(
        cogRpm(new int[]{11, 74, 98, 87, 86, 60, 23, 11, 68, 15, 59, 88, 56, 94, 91, 50, 76}));
  }

  public static double cogRpm(final int[] cogs) {
    return (cogs.length % 2 == 0 ? -1d : 1d) * cogs[0] / cogs[cogs.length - 1];
  }

}
