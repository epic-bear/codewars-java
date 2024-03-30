package kata.kyu_7;


import java.util.Arrays;

public class ColoredHexes {

    public static void main(String[] args) {
        System.out.println(hexColor(""));
    }

    public static String hexColor(String codes) {
        if (codes.replaceAll("0", "").length() <= 2) {
            return "black";
        }
        int[] values = Arrays.stream(codes.split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxValue = Arrays.stream(values).max().orElse(0);
        if (values[0] == values[1] && values[1] == values[2]) {
            return "white";
        } else if (values[0] == maxValue) {
            if (values[0] == values[1]) {
                return "yellow";
            } else if (values[0] == values[2]) {
                return "magenta";
            } else {
                return "red";
            }
        } else if (values[1] == maxValue) {
            if (values[1] == values[2]) {
                return "cyan";
            } else {
                return "green";
            }
        }
        return "blue";
    }
}
