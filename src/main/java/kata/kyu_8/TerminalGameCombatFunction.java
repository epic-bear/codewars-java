package kata.kyu_8;

public class TerminalGameCombatFunction {

    public static void main(String[] args) {

    }

    public static int combat(int health, int damage) {
        return Math.max(0, health - damage);
    }
}
