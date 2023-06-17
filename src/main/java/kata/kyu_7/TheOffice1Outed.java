package kata.kyu_7;

import java.util.Arrays;

public class TheOffice1Outed {

  public static void main(String[] args) {
    System.out.println(outed(new Person[]{
        new Person("tim", 0),
        new Person("jim", 2),
        new Person("randy", 0),
        new Person("sandy", 7),
        new Person("andy", 0),
        new Person("katie", 5),
        new Person("laura", 1),
        new Person("saajid", 2),
        new Person("alex", 3),
        new Person("john", 2),
        new Person("mr", 0)
    }, "laura"));
  }

  public static String outed(Person[] meet, String boss) {
    double overallHappiness = Arrays.stream(meet)
        .mapToInt(x -> !x.name.equals(boss) ? x.happiness : x.happiness * 2)
        .sum() / (double) meet.length;
    return overallHappiness > 5 ? "Nice Work Champ!" : "Get Out Now!";
  }

  static class Person {

    final String name;    // team member's name
    final int happiness;  // happiness rating out of 10

    Person(String name, int happiness) {
      this.name = name;
      this.happiness = happiness;
    }
  }
}
