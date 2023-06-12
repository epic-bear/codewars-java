package kata.kyu_8;

public class BeConciseIV {

  public static void main(String[] args) {

  }

  public static String kata(String[] a,String s){
    int i=java.util.List.of(a).indexOf(s);
    return i<0?"Not found": i+"";
  }
}