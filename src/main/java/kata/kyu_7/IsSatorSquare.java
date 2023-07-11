package kata.kyu_7;

public class IsSatorSquare {

  public static void main(String[] args) {
    System.out.println(isSatorSquare(new char[][]{{'P', 'A', 'R', 'T'},
                                                  {'A', 'G', 'A', 'R'},
                                                  {'R', 'A', 'G', 'A'},
                                                  {'T', 'R', 'A', 'M'}}));
  }

  public static Boolean isSatorSquare(char[][] tablet) {
    for (int i = 0; i < tablet.length / 2; i++) {
      for (int j = 0; j < tablet[i].length; j++) {
        if(tablet[i][j] != tablet[tablet.length - 1 - i][tablet[i].length - 1 - j]) {
          return false;
        }
        if (tablet[i][j] != tablet[j][i]){
          return false;
        }
      }
    }

    return true;
  }
}
