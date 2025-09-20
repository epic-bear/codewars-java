package kata.kyu_7;

import java.util.Map;

public class ResistorColorCodes {

    public static void main(String[] args) {
        System.out.println(decodeResistorColors("yellow violet black"));
    }

    public static String decodeResistorColors(String bands) {
        Map<String, Integer> resistorCodes = Map.of("black", 0, "brown", 1, "red", 2, "orange", 3, "yellow", 4, "green",
                5, "blue", 6, "violet", 7, "gray", 8, "white", 9);
        Map<String, String> tolerance = Map.of("gold", "5%", "silver", "10%");

        String[] colors = bands.split(" ");
        double ohms = (resistorCodes.get(colors[0]) * 10 +
                resistorCodes.get(colors[1])) * Math.pow(10, resistorCodes.get(colors[2]));
        String result =
                ohms >= 1000000 ?
                        (ohms / 1000000. % (int) (ohms / 1000000.) == 0 ?
                                (int) (ohms / 1000000.) + "M" : ohms / 1000000. + "M") :
                        ohms < 1000 ? String.valueOf((int) ohms) :
                                ohms / 1000. % (int) (ohms / 1000.) == 0 ?
                                        (int) (ohms / 1000.) + "k" : ohms / 1000. + "k";
        String finalTolerance = colors.length == 4 ? tolerance.get(colors[3]) : "20%";
        return result + " ohms, " + finalTolerance;
    }
}
