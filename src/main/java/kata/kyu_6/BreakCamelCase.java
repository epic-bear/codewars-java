package kata.kyu_6;

public class BreakCamelCase {
    public static String camelCase(String input) {
        char[] chars =input.toCharArray();
        int[] array = new int[chars.length];
        StringBuilder string = new StringBuilder();
        for (int i=0; i<chars.length; i++){
            array[i]= chars[i];
        }
        for ( int i=0; i<array.length; i++){
            if (array[i]>=65 && array[i]<=90){
                string.append(" ").append(chars[i]);
            }
            else
                string.append(chars[i]);
        }
        return string.toString();
    }
}
