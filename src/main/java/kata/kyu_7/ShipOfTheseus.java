package kata.kyu_7;

public class ShipOfTheseus {
    public static void main(String[] args) {
        System.out.println(shipOfTheseus(new String[][]{{"a", "b", "c"}, {"a", "b", "c"}, {"x", "y", "c"}, {"x", "y", "z"}}));
    }

    public static boolean shipOfTheseus(String[][] ship) {
        int count = 0;
        for (int i = 0; i < ship.length - 1; i++) {
            if (ship[i].length != ship[i + 1].length) {
                return false;
            }
            for (int j = 0; j < ship[i].length; j++) {
                if (!ship[i][j].equals(ship[i + 1][j])) {
                    count++;
                }
            }
            if (count != 1) {
                return false;
            } else {
                count = 0;
            }
        }
        return true;
    }
}
