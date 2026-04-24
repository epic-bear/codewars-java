package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class ANTISTRING {
    public static void main(String[] args) {
        System.out.println(antiString("abcWXY123"));
    }

    public static String antiString(String str){
        Map<Character, Character> characterMap = getCharacterCharacterMap();

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()){
            if (Character.isUpperCase(c)){
                stringBuilder.append(characterMap.get(Character.toLowerCase(c)));
            } else if (Character.isLowerCase(c)){
                stringBuilder.append(Character.toUpperCase(characterMap.get(c)));
            } else if (Character.isDigit(c)){
                stringBuilder.append(9 - Character.getNumericValue(c));
            }
        }
        return stringBuilder.reverse().toString();
    }

    private static Map<Character, Character> getCharacterCharacterMap() {
        Map<Character, Character> characterHashMap = new HashMap<>();

        characterHashMap.put('a', 'z');
        characterHashMap.put('b', 'y');
        characterHashMap.put('c', 'x');
        characterHashMap.put('d', 'w');
        characterHashMap.put('e', 'v');
        characterHashMap.put('f', 'u');
        characterHashMap.put('g', 't');
        characterHashMap.put('h', 's');
        characterHashMap.put('i', 'r');
        characterHashMap.put('j', 'q');
        characterHashMap.put('k', 'p');
        characterHashMap.put('l', 'o');
        characterHashMap.put('m', 'n');
        characterHashMap.put('n', 'm');
        characterHashMap.put('o', 'l');
        characterHashMap.put('p', 'k');
        characterHashMap.put('q', 'j');
        characterHashMap.put('r', 'i');
        characterHashMap.put('s', 'h');
        characterHashMap.put('t', 'g');
        characterHashMap.put('u', 'f');
        characterHashMap.put('v', 'e');
        characterHashMap.put('w', 'd');
        characterHashMap.put('x', 'c');
        characterHashMap.put('y', 'b');
        characterHashMap.put('z', 'a');
        return characterHashMap;
    }
}
