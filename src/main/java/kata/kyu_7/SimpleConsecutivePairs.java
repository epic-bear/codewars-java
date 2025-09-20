package kata.kyu_7;

public class SimpleConsecutivePairs {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,5,8,-4,-3,7,6,5}));
    }

    public static int solve(int [] arr){
        int count = 0;
        for (int i = 0; i + 1 < arr.length; i += 2) {
            if (Math.abs(arr[i] - arr[i + 1]) == 1) {
                count++;
            }
        }

        return count;
    }
}
