package kata.kyu_7;

import java.time.LocalDate;

public class FindYourVillainName {

    public static void main(String[] args) {
        System.out.println(getVillianName(LocalDate.of(2000, 12, 2)));
    }

    public static String getVillianName(LocalDate birthdate) {
        String[] first = {"The Evil", "The Vile", "The Cruel", "The Trashy", "The Despicable", "The Embarrassing", "The Disreputable", "The Atrocious", "The Twirling", "The Orange", "The Terrifying", "The Awkward"};
        String[] last = {"Mustache", "Pickle", "Hood Ornament", "Raisin", "Recycling Bin", "Potato", "Tomato", "House Cat", "Teaspoon", "Laundry Basket"};
        return String.format("%s %s", first[birthdate.getMonthValue() - 1], last[birthdate.getDayOfMonth() % 10]);
    }
}
