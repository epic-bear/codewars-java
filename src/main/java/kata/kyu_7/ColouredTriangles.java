package kata.kyu_7;

public class ColouredTriangles {

    public static void main(String[] args) {
        System.out.println(triangle("RBRGBRBGGRRRBGBBBGG"));
    }

    public static char triangle(String row) {
        while (row.length() > 1) {
            String result = "";
            for (int i = 0; i < row.length() - 1; i++) {
                if (row.charAt(i) == row.charAt(i + 1)) {
                    result += row.charAt(i);
                } else if (row.charAt(i) != 'R' && row.charAt(i + 1) != 'R') {
                    result += 'R';
                } else if (row.charAt(i) != 'G' && row.charAt(i + 1) != 'G') {
                    result += 'G';
                } else {
                    result += 'B';
                }
            }
            row = result;
        }
        return row.charAt(0);
    }
}
