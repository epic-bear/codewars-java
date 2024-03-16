package kata.kyu_7;

import java.util.Map;

public class StonePickaxeCrafting {

    public static void main(String[] args) {
        System.out.println(stonePick(new String[]{"Sticks", "Sticks", "Cobblestone", "Cobblestone", "Cobblestone"}));
    }

    public static int stonePick(String[] arr) {
        Map<String, Integer> count = new java.util.HashMap<>(Map.of("Sticks", 0, "Cobblestone", 0));
        for (String s : arr) {
            switch (s) {
                case "Cobblestone":
                    count.replace("Cobblestone", count.get("Cobblestone") + 1);
                    break;
                case "Sticks":
                    count.replace("Sticks", count.get("Sticks") + 1);
                    break;
                case "Wood":
                    count.replace("Sticks", count.get("Sticks") + 4);
                    break;
            }
        }
        return Math.min(count.get("Cobblestone") / 3, count.get("Sticks") / 2);
    }
}
