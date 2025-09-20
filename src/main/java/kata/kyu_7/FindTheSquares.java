package kata.kyu_7;


public class FindTheSquares {

    public static void main(String[] args) {
        System.out.println(findSquares(9));
    }

    public static String findSquares(int n){
        return (long) Math.pow(n / 2 + 1, 2) + "-" + (long) Math.pow(n / 2, 2);
    }
}
