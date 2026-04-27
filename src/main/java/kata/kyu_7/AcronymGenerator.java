package kata.kyu_7;

import java.util.Arrays;

public class AcronymGenerator {
    public static void main(String[] args) {
        System.out.println(createAcronym("Meyer", "Thomas"));
    }

    public static String createAcronym(String lastName, String firstName) {
        firstName = Arrays.stream(firstName.split("[ -]"))
                .filter(s -> !s.isEmpty())
                .map(s -> s.toUpperCase().substring(0, 1))
                .reduce("", String::concat);
        lastName = Arrays.stream(lastName.split("[ -]"))
                .filter(s -> !s.isEmpty())
                .map(s -> s.equalsIgnoreCase("von") ? s.substring(0, 1).toLowerCase()
                        : s.toUpperCase().substring(0, 1))
                .reduce("", String::concat);
        return firstName + lastName;
    }

}
