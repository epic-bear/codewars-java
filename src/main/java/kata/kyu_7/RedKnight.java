package kata.kyu_7;

public class RedKnight {

    public static void main(String[] args) {
        System.out.println(redKnight(0, 8));
    }

    public static PawnDistance redKnight(int knight, long pawn) {

        return new PawnDistance(knight == 0 ? (pawn % 2 == 0 ? "White" : "Black") : (pawn % 2 == 0 ? "Black" : "White"),
                pawn * 2);
    }

    static class PawnDistance {

        private String color;
        private long distance;

        public PawnDistance(String s, long d) {
            color = s;
            distance = d;
        }

        @Override
        public String toString() {
            return "PawnDistance{" +
                    "color='" + color + '\'' +
                    ", distance=" + distance +
                    '}';
        }
    }
}
