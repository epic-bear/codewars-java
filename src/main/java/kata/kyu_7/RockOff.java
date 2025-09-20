package kata.kyu_7;

public class RockOff {

    public static void main(String[] args) {
        System.out.println(solveRockOff(new int[]{47, 7, 2}, new int[]{47, 7, 2}));
    }

    public static String solveRockOff(final int[] alice, final int[] bob) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                aliceScore++;
            } else if (bob[i] > alice[i]) {
                bobScore++;
            }
        }

        return aliceScore > bobScore ? String.format("%d, %d: Alice made \"Kurt\" proud!", aliceScore, bobScore) :
                bobScore > aliceScore ? String.format("%d, %d: Bob made \"Jeff\" proud!", aliceScore, bobScore) :
                        String.format("%d, %d: that looks like a \"draw\"! Rock on!", aliceScore, bobScore);
    }
}
