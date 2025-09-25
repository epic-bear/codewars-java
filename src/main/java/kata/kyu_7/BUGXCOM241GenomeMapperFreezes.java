package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class BUGXCOM241GenomeMapperFreezes {

  public static void main(String[] args) {

  }

  public static class SlcBase{
    private SlcBase next;
    private char nucleobase;

    public SlcBase(SlcBase next, char nucleobase) {
      this.next = next;
      this.nucleobase = nucleobase;
    }

    public SlcBase next() {
      return next;
    }

    public char nucleobase() {
      return nucleobase;
    }
  }

  private static SlcBase stringToStrand(String str) {
    SlcBase current = null;
    int len = str.length();
    for(int i=0; i<len; ++i) {
      current = new SlcBase(current, str.charAt(len - i - 1));
    }
    return current;
  }


  public class HopeLunaMapper {

    private final Map<Character, Character> mapping = new HashMap<>();

    public HopeLunaMapper() {
      mapping.put('H', 'L'); mapping.put('L', 'H');
      mapping.put('O', 'U'); mapping.put('U', 'O');
      mapping.put('P', 'N'); mapping.put('N', 'P');
      mapping.put('E', 'A'); mapping.put('A', 'E');
      mapping.put('h', 'l'); mapping.put('l', 'h');
      mapping.put('o', 'u'); mapping.put('u', 'o');
      mapping.put('p', 'n'); mapping.put('n', 'p');
      mapping.put('e', 'a'); mapping.put('a', 'e');
    }

    public String mapStrand(SlcBase base) {
      StringBuilder result = new StringBuilder();
      for (SlcBase current = base; current != null; current = current.next()) {
        result.append(mapping.getOrDefault(current.nucleobase(), current.nucleobase()));
      }
      return result.toString().toUpperCase();
    }

  }
}
