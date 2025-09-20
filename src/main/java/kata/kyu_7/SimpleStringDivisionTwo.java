package kata.kyu_7;

public class SimpleStringDivisionTwo {

    public static void main(String[] args) {
        System.out.println(solve("1 2 36 4 8", 3));
    }

    public static int solve(String s, int k) {
        String[] numbers = s.split(" ");
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && Integer.parseInt(numbers[i].concat(numbers[j])) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
