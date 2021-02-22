package kata.kyu_7;

import static java.util.Comparator.comparingLong;
import static java.util.stream.IntStream.of;
import static java.util.stream.IntStream.range;


public class StatusArrays {

  public static void main(String[] args) {

  }

  public static int[] status(int[] nums) {

    return range(0, nums.length).boxed()
        .sorted(comparingLong(i -> i + of(nums).filter(n -> n < nums[i]).count()))
        .mapToInt(i -> nums[i]).toArray();
  }
}
