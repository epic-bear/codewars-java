package kata.kyu_7;

public class HelpYourFellowWarrior {

    public static void main(String[] args) {
        System.out.println(getHonorPath(2, 11));
    }

    public static String getHonorPath(int honorScore, int targetHonorScore) {
        int kyu1 = (targetHonorScore - honorScore) / 2;
        int kyu2 = (targetHonorScore - honorScore) % 2;

        return honorScore >= targetHonorScore ? "" : String.format("2kyus: %d, 1kyus: %d", kyu2, kyu1);
    }
}
