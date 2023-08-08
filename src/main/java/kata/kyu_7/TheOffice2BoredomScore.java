package kata.kyu_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheOffice2BoredomScore {

  public static class Person {

    public String name;
    public String department;

    public Person(String name, String department) {
      this.name = name;
      this.department = department;
    }
  }

  public static void main(String[] args) {
    System.out.println(boredom(new Person[]{new Person("tim", "IS"),
        new Person("jim", "finance"),
        new Person("randy", "pissing about"),
        new Person("sandy", "cleaning"),
        new Person("andy", "cleaning"),
        new Person("katie", "cleaning"),
        new Person("laura", "pissing about"),
        new Person("saajid", "regulation"),
        new Person("alex", "regulation"),
        new Person("john", "accounts"),
        new Person("mr", "canteen")}));
  }

  public static String boredom(Person[] staff) {
    Map<String, Integer> departments = new HashMap<>();

    departments.put("accounts", 1);
    departments.put("finance", 2);
    departments.put("canteen", 10);
    departments.put("regulation", 3);
    departments.put("trading", 6);
    departments.put("change", 6);
    departments.put("IS", 8);
    departments.put("retail", 5);
    departments.put("cleaning", 4);
    departments.put("pissing about", 25);

    long score = Arrays.stream(staff).mapToInt(person -> departments.get(person.department)).sum();

    return score <= 80 ? "kill me now" : (score > 100 ? "party time!!" : "i can handle this");
  }
}
