package kata.kyu_7;

public class ExclamationMarksSeries8 {

    public static void main(String[] args) {
        System.out.println(remove("Hi!"));
    }

    public static String remove(String s){
        return s.replaceAll("!", "") + s.replaceAll("[^!]", "");
    }
}
