package kata.kyu_7;

import java.util.Arrays;

public class HappyBirthday {

    public static void main(String[] args) {
        System.out.println(wrap(17,32,11));
    }

    public static int wrap(int height, int width, int length){
        int [] sides = new int[] {height, width, length};
        Arrays.sort(sides);
        return sides[0] * 4 + sides[1] * 2 + sides[2] * 2 + 20;
    }
}
