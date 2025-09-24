package kata.kyu_7;

public class QueueTimeCounter {

  public static void main(String[] args) {
    System.out.println(queue(new int[]{2, 5, 3, 6, 4}, 1));
  }

  public static int queue(int[] queuers, int pos) {
    int count = 0;

    while (queuers[pos] > 0) {
      for (int i = 0; i < queuers.length; i++) {
        if (queuers[i] > 0) {
          --queuers[i];
          count++;
        }
        if (i == pos && queuers[i] == 0) {
          break;
        }
      }
    }
    return count;
  }
}
