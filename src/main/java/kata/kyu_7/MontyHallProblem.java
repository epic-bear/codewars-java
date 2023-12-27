package kata.kyu_7;

import java.util.Arrays;

public class MontyHallProblem {

    public static void main(String[] args) {
        System.out.println(montyHallCase(1, new int[]{3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
    }

    public static int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
        return (int) Math.round((100.0 / participantGuesses.length) *
                Arrays.stream(participantGuesses).filter(x -> x != correctDoorNumber).count());
    }
}
