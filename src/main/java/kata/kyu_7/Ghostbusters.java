package kata.kyu_7;

public class Ghostbusters {

    public static void main(String[] args) {
        System.out.println(ghostBusters("Sky scra per"));
    }

    public static String ghostBusters(String building) {
        return building.length() == building.replaceAll(" ", "")
                .length() ? "You just wanted my autograph didn't you?" : building.replaceAll(" ", "");
    }
}
