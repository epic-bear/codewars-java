package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheSolarSystemJumbledPlanets {

  private static final List<String> bodies = new ArrayList<>(Arrays.asList(
      "Asteroid",
      "Pluto",
      "Mercury",
      "Mars",
      "Venus",
      "Earth",
      "Neptune",
      "Uranus",
      "Saturn",
      "Jupiter"
  ));

  public static void main(String[] args) {
    System.out.println(Arrays.toString(annotate(
        new String[]{"Mars", "Asteroid", "Venus", "Jupiter", "Asteroid", "Earth", "Pluto"})));
  }

  public static char[] annotate(String[] celestialBodies) {
    return IntStream.range(0, celestialBodies.length - 1).mapToObj(
        x -> bodies.indexOf(celestialBodies[x]) > bodies.indexOf(celestialBodies[x + 1]) ? "<" :
            bodies.indexOf(celestialBodies[x]) < bodies.indexOf(celestialBodies[x + 1]) ? ">" : "=")
        .collect(Collectors.joining()).toCharArray();
  }
}
