package kata.kyu_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TheBaumSweetSequence {

  public static void main(String[] args) {
    for (int i = 0; i < 20; i++) {
      System.out.println(Integer.toBinaryString(i));
    }
    System.out.println(toList(new BaumSweet(), 20));
  }

  public static class BaumSweet implements Iterator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
      String binaryCount = Integer.toBinaryString(count++);

      if (binaryCount.length() == 1) {
        return 1;
      }

      String [] zerosBlocks = binaryCount.split("1");
      for (String block : zerosBlocks) {
        if (!block.isEmpty() && block.length() % 2 != 0) {
          return 0;
        }
      }
      return 1;
    }

    @Override
    public boolean hasNext() {
      return true;
    }
  }

  private static List<Integer> toList(Iterator<Integer> iterator, int size) {
    if(iterator == null) return null;
    List<Integer> list = new ArrayList<>();
    while(iterator.hasNext() && list.size() < size) list.add(iterator.next());
    return list;
  }
}

