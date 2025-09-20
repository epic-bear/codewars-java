package kata.kyu_7;

import java.util.Arrays;

public class NameArrayCapping {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capMe(new String[]{"jo", "nelson", "jurie"})));
    }

    public static String[] capMe(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].isEmpty()) {
                strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase();
            }
        }
        return strings;
    }
}
