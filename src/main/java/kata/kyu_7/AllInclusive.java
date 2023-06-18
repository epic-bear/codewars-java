package kata.kyu_7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AllInclusive {

  public static void main(String[] args) {
    System.out.println(containAllRots("FDDDZVRCcssG",
        Arrays.asList("DZVRCcssGFDD", "GFDDDZVRCcss", "RCcssGFDDDZV", "DDDZVRCcssGF",
            "wmsDpHSB", "FDDDZVRCcssG", "Ydvvs", "VRCcssGFDDDZ", "ssGFDDDZVRCc", "LqlDHJFpdAY",
            "CcssGFDDDZVR", "DDZVRCcssGFD", "ZVRCcssGFDDD", "sGFDDDZVRCcs", "DQAfXMj")));
  }

  public static boolean containAllRots(String string, List<String> arr) {
    LinkedList<Character> chars = new LinkedList<>();

    for (Character c : string.toCharArray()) {
      chars.add(c);
    }

    for (int i = 0; i < chars.size(); i++) {
      if (!arr.contains(chars.stream().map(Objects::toString).collect(Collectors.joining()))) {
        return false;
      }
      chars.addLast(chars.poll());
    }
    return true;
  }
}
