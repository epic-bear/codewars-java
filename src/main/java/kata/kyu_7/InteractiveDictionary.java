package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class InteractiveDictionary {

  public static void main(String[] args) {

  }

  public class Dictionary {

    Map<String, String> dictionary;

    public Dictionary() {
      dictionary = new HashMap<>();
    }

    public void newEntry(String key, String value) {
      dictionary.put(key, value);
    }

    public String look(String key) {
      return dictionary.getOrDefault(key, String.format("Cant find entry for %s", key));
    }
  }
}
