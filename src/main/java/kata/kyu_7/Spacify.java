package kata.kyu_7;

public class Spacify {

    public static void main(String[] args) {
        System.out.println(spacify("hello world"));
    }

    public static String spacify(String str){
        return str.replaceAll("", " ").trim();
    }
}
