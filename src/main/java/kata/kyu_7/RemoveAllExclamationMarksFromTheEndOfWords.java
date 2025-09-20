package kata.kyu_7;

public class RemoveAllExclamationMarksFromTheEndOfWords {

    public static void main(String[] args) {
        System.out.println(removeBang("!!!Hi !!hi!!! !hi  !"));
    }

    public static String removeBang(String str) {
        String[] strings = str.split(" ");

        for (int i = 0; i < strings.length; i++) {
            while (strings[i].length() > 1 && strings[i].charAt(strings[i].length() - 1) == '!') {
                strings[i] = strings[i].substring(0, strings[i].length() - 1);
            }
        }

        return String.join(" ", strings);
    }
}
