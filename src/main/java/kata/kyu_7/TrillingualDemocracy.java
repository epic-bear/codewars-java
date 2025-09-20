package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class TrillingualDemocracy {

    public static void main(String[] args) {
        System.out.println(trilingualDemocracy(new char[]{'F', 'F', 'F'}));
    }

    public static char trilingualDemocracy(char[] group) {
        HashMap<Character, Integer> count = new HashMap<>(Map.of('D', 0, 'F', 0, 'I', 0, 'K', 0));
        int value = 0;
        for (char i : group) {
            count.put(i, count.get(i) + 1);
        }
        if (count.containsValue(3)) {
            value = 3;
        } else if (count.containsValue(2)) {
            value = 1;
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return '?';
    }
}
