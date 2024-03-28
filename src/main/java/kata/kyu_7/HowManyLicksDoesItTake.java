package kata.kyu_7;

import java.util.Map;

public class HowManyLicksDoesItTake {

    public static void main(String[] args) {
        System.out.println(totalLicks(Map.of("freezing temps", 0, "clear skies", -2)));
    }

    public static String totalLicks(Map<String, Integer> env) {
        String toughestChallenge = "";
        int toughestChallengeScore = 0;
        int licks = 252;

        for (Map.Entry<String, Integer> entry : env.entrySet()) {
            licks += entry.getValue();
            if (entry.getValue() > toughestChallengeScore) {
                toughestChallengeScore = entry.getValue();
                toughestChallenge = entry.getKey();
            }
        }

        return String.format("It took %d licks to get to the tootsie roll center of a tootsie pop.", licks)
                + (toughestChallengeScore > 0 ? String.format(" The toughest challenge was %s.", toughestChallenge) : "");
    }
}
