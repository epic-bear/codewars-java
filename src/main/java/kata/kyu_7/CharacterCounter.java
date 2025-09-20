package kata.kyu_7;

import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter {

    public static void main(String[] args) {
        System.out.println(validateWord("??&^^^Abcabc"));
    }

    public static boolean validateWord(String word) {
        return new HashSet<>(word.toLowerCase().chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
        ).size() == 1;
    }
}
