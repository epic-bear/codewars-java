package kata.kyu_7;

public class HelpALFFindHisSpaceship {

    public static void main(String[] args) {
        System.out.println(findSpaceship("..\n.X"));
    }

    public static String findSpaceship(String map) {
        if (!map.contains("X")) {
            return "Spaceship lost forever.";
        } else {
            String result = "";
            String[] data = map.split("\n");
            for (int i = data.length - 1; i >= 0; i--) {
                if (data[i].contains("X")) {
                    result = String.format("[%d, %d]", data[i].indexOf('X') , data.length - 1 - i);
                    break;
                }
            }
            return result;
        }
    }
}
