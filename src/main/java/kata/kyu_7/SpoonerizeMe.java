package kata.kyu_7;


public class SpoonerizeMe {

  public static void main(String[] args) {


  }

  public static String spoonerize(String words){

    String[] a = words.split(" ");

    return a[1].charAt(0) + a[0].substring(1)+" "+a[0].charAt(0) + a[1].substring(1);
  }
}