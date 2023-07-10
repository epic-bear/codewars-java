package kata.kyu_7;

public class RockPaperScissorsLizardSpock {

  public static void main(String[] args) {
    System.out.println(rpsls("rock", "lizard"));
  }

  public static String rpsls(String player1, String player2){
    if(player1.equals(player2)){
      return "Draw!";
    }
    else if (player1.equals("scissors") && player2.equals("paper")  ||
             player1.equals("paper") && player2.equals("rock")      ||
             player1.equals("rock") && player2.equals("lizard")     ||
             player1.equals("lizard") && player2.equals("spock")    ||
             player1.equals("spock") && player2.equals("scissors")  ||
             player1.equals("scissors") && player2.equals("lizard") ||
             player1.equals("lizard") && player2.equals("paper")    ||
             player1.equals("paper") && player2.equals("spock")     ||
             player1.equals("spock") && player2.equals("rock")      ||
             player1.equals("rock") && player2.equals("scissors")){
        return "Player 1 Won!";
    }
    return "Player 2 Won!";
  }
}
