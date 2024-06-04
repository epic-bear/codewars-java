package kata.kyu_7;

public class InvisibleCubes {

    public static void main(String[] args) {
        System.out.println(notVisibleCubes(5L));
    }

    public static Long notVisibleCubes(Long n) {
        return (long) Math.pow(Math.max(0 ,n - 2), 3);
    }
}
