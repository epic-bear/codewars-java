package kata.kyu_7;

public class TheHuntingOfTheSnark {

    public static void main(String[] args) {
        int[] booj =
                {0, 0, 36, 1, 0, 0, 4, 2, 2, 437, 2, 0, 8, 0, 0, 2, 1};
        String[] bloog =
                {"blimpy", "", "", "", "", "", "also a horse but not giant", "", "a doofus", "literally Zeus", "", "", "", "", "snart","","snark"};

        System.out.println(assess(booj, bloog));
    }

    public static String assess(int[] booj, String[] bloog) {
        for (int i = 0; i <= 8; i++) {
            int left = 8 - i;
            int right = 8 + i;

            if (bloog[left].equals("snark") || bloog[right].equals("snark")) {
                int boojumeter = bloog[left].equals("snark") ? booj[left] : booj[right];

                if (i <= 2) {
                    return boojumeter >= 15 ? "Run!" : "Pounce!";
                } else if (i <= 4) {
                    return boojumeter >= 15 ? "Escape quietly..." : "Stalk quietly...";
                } else {
                    return boojumeter >= 15 ? "There's a Boojum close." : "There's a Snark close.";
                }
            }
        }
        return "Keep hunting.";
    }
}
