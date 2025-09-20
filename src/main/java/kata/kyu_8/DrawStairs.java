package kata.kyu_8;

public class DrawStairs {

    public static void main(String[] args) {
        System.out.println(draw(3));
    }

    public static String draw(int n){
        StringBuilder result = new StringBuilder();
        int count = 1;
        while (count <= n){
            result.append("I\n").append(" ".repeat(count++));
        }
        return result.toString().trim();
    }
}
