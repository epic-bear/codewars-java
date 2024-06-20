package kata.kyu_7;


public class Pandemia {

    public static void main(String[] args) {
        System.out.println(infected("XXXXX"));
    }

    public static double infected(String input) {
        int population = 0;
        int infected = 0;
        for (String s : input.split("X")) {
            if (s.length() > 0) {
                population += s.length();
            }
            if (s.contains("1")) {
                infected += s.length();
            }
        }
        return population != 0 ? infected * 100. / population : 0;
    }
}
