package kata.kyu_8;

public class IsTheStringUppercase {

    public static void main(String[] args) {
        System.out.println(isUpperCase("FDFDFEwe"));
    }

    public static boolean isUpperCase(String s) {
       return s.toUpperCase().equals(s);
    }
}
