package kata.kyu_7;

import java.util.List;
import java.util.stream.Collectors;

public class FriendOrFoe {

  public static void main(String[] args) {
    System.out.println(friend(List.of("Ryan", "Kieran", "Jason", "Yous")));
  }

  public static List<String> friend(List<String> x){
    return x.stream().filter(name -> name.length() == 4).collect(Collectors.toList());
  }
}
