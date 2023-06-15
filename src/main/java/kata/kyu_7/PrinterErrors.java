package kata.kyu_7;

public class PrinterErrors {

  public static void main(String[] args) {
    System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
  }

  public static String printerError(String s) {
    return s.replaceAll("[a-m]","").length() + "/" + s.length();
  }
}
