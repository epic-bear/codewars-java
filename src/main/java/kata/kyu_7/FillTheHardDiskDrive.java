package kata.kyu_7;

public class FillTheHardDiskDrive {

    public static void main(String[] args) {
        System.out.println(save(new int[]{4, 4, 4, 3, 3}, 12));
    }

    public static int save(int[] sizes, int hd) {
        int count = 0;
        for (int size : sizes) {
            if (size <= hd) {
                count++;
                hd -= size;
            } else {
                break;
            }
        }
        return count;
    }
}
