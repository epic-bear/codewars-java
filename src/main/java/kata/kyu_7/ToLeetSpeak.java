package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class ToLeetSpeak {

  public static void main(String[] args) {

    System.out.println(toLeetSpeak("LEET"));
  }

  static String toLeetSpeak(final String speak) {
    Map<Character, Character> characterMap = new HashMap<>();
    characterMap.put('A', '@');
    characterMap.put('B', '8');
    characterMap.put('C', '(');
    characterMap.put('D', 'D');
    characterMap.put('E', '3');
    characterMap.put('F', 'F');
    characterMap.put('G', '6');
    characterMap.put('H', '#');
    characterMap.put('I', '!');
    characterMap.put('J', 'J');
    characterMap.put('K', 'K');
    characterMap.put('L', '1');
    characterMap.put('M', 'M');
    characterMap.put('N', 'N');
    characterMap.put('O', '0');
    characterMap.put('P', 'P');
    characterMap.put('Q', 'Q');
    characterMap.put('R', 'R');
    characterMap.put('S', '$');
    characterMap.put('T', '7');
    characterMap.put('U', 'U');
    characterMap.put('V', 'V');
    characterMap.put('W', 'W');
    characterMap.put('X', 'X');
    characterMap.put('Y', 'Y');
    characterMap.put('Z', '2');
    String result = "";
    for (char c : speak.toCharArray()) {
      if (characterMap.containsKey(c)) {
        result += characterMap.get(c);
      } else {
        result += c;
      }
    }
    return result;
  }
}
