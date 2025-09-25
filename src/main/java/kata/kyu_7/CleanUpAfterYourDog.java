package kata.kyu_7;

public class CleanUpAfterYourDog {

  public static void main(String[] args) {
    System.out.println(
        crap(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 2, 2));
  }

  public static String crap(char[][] garden, int bags, int cap) {
    int crapCounter = 0;

    for (char[] chars : garden) {
      for (char aChar : chars) {
        if (aChar == '@') {
          ++crapCounter;
        } else if (aChar == 'D') {
          return "Dog!!";
        }
      }
    }

    return crapCounter > bags * cap ? "Cr@p" : "Clean";
  }
}
