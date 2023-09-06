package kata.kyu_7;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {

  public static void main(String[] args) {
    ArrayList<int[]> list = new ArrayList<>();
    list.add(new int[]{10, 0});
    list.add(new int[]{3, 5});
    list.add(new int[]{2, 5});
    System.out.println(countPassengers(list));
  }

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
  }
}
