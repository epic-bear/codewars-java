package kata.kyu_7;

public class CenterOfTheMatrix {

    public static void main(String[] args) {
        System.out.println(center(new int[][]{ {5,1,3}, {6,2,6}, {7,4,5} }));
    }

    public static Integer center(int[][] matrix) {
        if (matrix.length % 2 != 0 && matrix[0].length % 2 != 0) {
            return matrix[matrix.length / 2][matrix[0].length / 2];
        }
        return null;
    }
}
