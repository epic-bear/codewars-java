package kata.kyu_7;

public class ReversingFun {

    public static void main(String[] args) {
        System.out.println(funReverse("012345"));
    }

    public static String funReverse(String s) {
        for (int i = 0; i < s.length(); i++) {
           s = s.substring(0, i) + new StringBuilder(s.substring(i)).reverse();
        }
        return s;
    }
}
