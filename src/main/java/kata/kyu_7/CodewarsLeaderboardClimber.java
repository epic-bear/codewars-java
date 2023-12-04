package kata.kyu_7;

public class CodewarsLeaderboardClimber {

    public static void main(String[] args) {
        System.out.println(leaderBoard("g964", 36097, 20000));
    }

    public static String leaderBoard(String user, int userScore, int yourScore) {
        if (userScore < yourScore) {
            return "Winning!";
        } else if (userScore == yourScore) {
            return "Only need one!";
        } else {
            int beta = (userScore - yourScore) / 3;
            int kyu8 = (userScore - yourScore) % 3;
            String result = String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.", user,
                    beta, kyu8);
            if (beta + kyu8 > 1000) {
                result += " Dammit!";
            }
            return result;
        }
    }
}
