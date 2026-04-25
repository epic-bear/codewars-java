package kata.kyu_7;

public class StringScramble {
    public static void main(String[] args) {
        System.out.println(scramble("abcd", new int[]{0, 3, 1, 2}));
    }

    public static String scramble(String str, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = str.charAt(i);
        }
        return String.valueOf(arr);
    }
}
