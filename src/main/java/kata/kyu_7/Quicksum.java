package kata.kyu_7;

public class Quicksum {

    public static void main(String[] args) {
        System.out.println(quicksum("MID CENTRAL"));
    }

    public static int quicksum(String packet) {
        if (packet.replaceAll("[\\sA-Z]", "").length() > 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < packet.length(); i++) {
            if (Character.isWhitespace(packet.charAt(i))) {
                continue;
            }
            count += (Character.getNumericValue(packet.charAt(i)) - 9) * (i + 1);
        }
        return count;
    }
}
