package kata.kyu_7;

public class TwoFightersOneFighter {

  public static void main(String[] args) {
    System.out
        .println(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
  }

  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    double fighter1stepsToWin = Math.ceil(fighter2.health / (double) fighter1.damagePerAttack);
    double fighter2stepsToWin = Math.ceil(fighter1.health / (double) fighter2.damagePerAttack);
    return (firstAttacker.equals(fighter1.name) && fighter1stepsToWin <= fighter2stepsToWin) ||
        fighter1stepsToWin <= fighter2stepsToWin - 1
        ? fighter1.name : fighter2.name;
  }

  public static class Fighter {

    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
      this.name = name;
      this.health = health;
      this.damagePerAttack = damagePerAttack;
    }
  }
}


