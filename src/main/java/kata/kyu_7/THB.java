package kata.kyu_7;

public class THB {
    public static void main(String[] args) {
        System.out.println(testing("For those of you who would like to test your solution before submitting it."));
    }

    public static String testing(String initial) {
        return initial == null ? "" :
                initial.replaceAll("[^thbTHB]", "");
    }
}
