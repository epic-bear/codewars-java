package kata.kyu_7;

import java.util.List;

public class MysteryColors {

    int numberOfDistinctColors(List<Color> mysteryColors) {
        return (int) mysteryColors.stream()
                .distinct().count();
    }
    int colorOccurrence(List<Color> mysteryColors, Color color) {
        return (int) mysteryColors.stream()
                .filter(x -> x.equals(color)).count();
    }

    public enum Color {
        RED, GREEN, BLUE
    }
}
