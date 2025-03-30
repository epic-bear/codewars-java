package kata.kyu_8;

public class StringClearing {

    public static void main(String[] args) {
        System.out.println(stringClean("This looks5 grea8t!"));
    }

    static String stringClean(String text) {
        return text.replaceAll("[0-9]", "");
    }
}
