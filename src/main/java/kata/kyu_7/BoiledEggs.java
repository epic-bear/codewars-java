package kata.kyu_7;

public class BoiledEggs {
    public static void main(String[] args) {
        System.out.println(cookingTime(10));
    }

    public static int cookingTime(int eggs){
        return eggs % 8 == 0 ? eggs / 8 * 5 : eggs / 8 * 5 + 5;
    }
}
