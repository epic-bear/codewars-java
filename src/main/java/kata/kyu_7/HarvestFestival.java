package kata.kyu_7;

public class HarvestFestival {

    public static void main(String[] args) {
        System.out.println(plant(',', 3, 7, 25));
    }

    public static String plant(char seed, int water, int fert, int temp){
        if (temp < 20 || temp > 30) {
            return "-".repeat(water * water) + seed;
        } else  {
            return ("-".repeat(water) + String.valueOf(seed).repeat(fert)).repeat(water);
        }
    }
}
