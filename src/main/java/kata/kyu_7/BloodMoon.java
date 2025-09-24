package kata.kyu_7;

public class BloodMoon {

  public static void main(String[] args) {
    System.out.println(bloodMoon(1));
  }

  public static double bloodMoon(int r){
    return Math.pow(r, 2) / 4;
  }
}
