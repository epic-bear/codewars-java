package kata.kyu_7;

public class DroneFlyBy {
    public static void main(String[] args) {
        System.out.println(flyBy("xxxx", "====T"));
    }

    public static String flyBy(String lamps, String drone){
        return lamps.length() > drone.length() ?
                "o".repeat(drone.length()).concat("x".repeat(lamps.length() - drone.length())) :
                "o".repeat(lamps.length());

    }
}
