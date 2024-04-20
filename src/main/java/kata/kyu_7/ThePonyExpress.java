package kata.kyu_7;

public class ThePonyExpress {

    public static void main(String[] args) {
        System.out.println(riders(new int[]{22, 47, 10, 25, 26, 34, 15}));
    }

    public static int riders(final int[] stations) {
        int miles = 0;
        int riders = 1;
        for (int i = 0; i < stations.length; i++) {
            miles += stations[i];
            if (i < stations.length - 1 && miles + stations[i + 1] > 100) {
                miles = 0;
                riders++;
            }
        }
        return riders;
    }

}
