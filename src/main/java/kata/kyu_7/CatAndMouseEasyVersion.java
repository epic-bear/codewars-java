package kata.kyu_7;

public class CatAndMouseEasyVersion {
    public static void main(String[] args) {
        System.out.println(catMouse("C....m"));
    }

    public static String catMouse(String x){
        return x.length() >= 6 ? "Escaped!" : "Caught!";
    }
}
