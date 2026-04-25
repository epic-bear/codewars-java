package kata.kyu_7;

public class AdaptiveSecuritySystem {
    public static void main(String[] args) {
        System.out.println(breachAttempts(new int[]{7, 6, 8, 9}, 6, 2));
    }

    public static int breachAttempts(int[] hackers, int securityLevel, int increase) {
        int count = 0;
        for (int hacker : hackers) {
            if (hacker <= securityLevel) {
                securityLevel += increase;
            } else {
                count++;
            }
        }
        return count;
    }
}
