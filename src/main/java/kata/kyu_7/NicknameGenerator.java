package kata.kyu_7;

public class NicknameGenerator {

    public static void main(String[] args) {
        System.out.println(nickname("Samantha"));
    }

    public static String nickname (String name) {
       return name.length() <= 3 ? "Error: Name too short" :
               name.substring(0, 3).matches(".*[aeiou]") ? name.substring(0, 4) : name.substring(0, 3);
    }
}
