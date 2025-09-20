package kata.kyu_8;

public class DrinkAbout {

    public static void main(String[] args) {
        System.out.println(peopleWithAgeDrink(13));
    }

    public static String peopleWithAgeDrink(int age) {
        return "drink " + (age < 14 ? "toddy" : age < 18 ? "coke" : age < 21 ? "beer" : "whisky");
    }
}
