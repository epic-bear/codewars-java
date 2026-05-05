package kata.kyu_7;

import java.util.Arrays;

public class HilbertsHotel {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(hilbertsHotel(new int[]{1, 2, 3, 4, 5}, 10, 1)));
    }

    public static int[] hilbertsHotel(int[] rooms, double people, double buses) {
        if (people <= Double.MAX_VALUE && buses <= Double.MAX_VALUE) {
            for (int i = 0; i < rooms.length; i++) {
                rooms[i] += (int) (people * buses);
            }
        } else if (people <= Double.MAX_VALUE) {
            for (int i = 0; i < rooms.length; i++) {
                rooms[i] *= (int) people + 1;
            }
        } else if (buses <= Double.MAX_VALUE) {
            for (int i = 0; i < rooms.length; i++) {
                rooms[i] *= (int) buses + 1;
            }
        } else {
            for (int i = 0; i < rooms.length; i++) {
                int sum = 0;
                int count = rooms[i];
                while (count > 0) {
                    sum += count--;
                }
                rooms[i] = sum;
            }
        }
        return rooms;
    }
}
