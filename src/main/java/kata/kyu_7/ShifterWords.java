package kata.kyu_7;

import java.util.Arrays;

public class ShifterWords {

    public static void main(String[] args) {
        System.out.println(count("WHO IS WHO"));
    }

    public static int count(String st){
        return (int) Arrays.stream(st.split(" "))
                .filter(word -> word.matches("^[HINSOXZMW]+$"))
                .distinct()
                .count();
    }
}
