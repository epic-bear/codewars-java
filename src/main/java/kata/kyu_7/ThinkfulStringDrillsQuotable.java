package kata.kyu_7;

public class ThinkfulStringDrillsQuotable {

  public static void main(String[] args) {
    System.out.println(quotable("Grae", "Practice makes perfect"));
  }

  public static String quotable(String name, String quote){
    return String.format("%s said: \"%s\"", name, quote);
  }
}
