package kata.kyu_7;

public class SmallestValueOfAnArray {

    public static void main(String[] args) {
        System.out.println(findSmallest(new int[]{1, 2, 3}, "index"));
    }

    public static int findSmallest(final int[] numbers, final String toReturn) {
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minIndex = i;
                minValue = numbers[i];
            }
        }
        return toReturn.equals("index") ? minIndex : minValue;
    }
}
