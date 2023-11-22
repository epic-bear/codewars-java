package kata.kyu_7;

public class ProductOfTheMainDiagonal {

    public static void main(String[] args) {
        System.out.println(ReturnProduct(new int[][]{{1, 0}, {0, 1}}));
    }

    public static int ReturnProduct(int[][] matrix) {
        int result = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            result *= matrix[i][i];
        }
        return result;
    }
}
