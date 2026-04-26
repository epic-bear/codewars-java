package kata.kyu_7;

public class ESPCards {
    public static void main(String[] args) {
        System.out.println(nameTheShape(new char[][]{
                "/-------------------\\".toCharArray(),
                "|                   |".toCharArray(),
                "|                   |".toCharArray(),
                "|    ***********    |".toCharArray(),
                "|    *         *    |".toCharArray(),
                "|    *         *    |".toCharArray(),
                "|    *         *    |".toCharArray(),
                "|    *         *    |".toCharArray(),
                "|    *         *    |".toCharArray(),
                "|    ***********    |".toCharArray(),
                "|                   |".toCharArray(),
                "|                   |".toCharArray(),
                "\\-------------------/".toCharArray()
        }));
    }

    public static String nameTheShape(final char[][] card) {
        return card[2][10] != ' ' ? "diamond"
                : card[3][5]  != ' ' ? "square"
                : "circle";
    }
}
