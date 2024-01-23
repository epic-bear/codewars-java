package kata.kyu_7;

public class BusMasteringWhoIsTheMostPrioritary {

    public static void main(String[] args) {
        System.out.println(arbitrate("001000101", 9));
    }

    public static String arbitrate(String input, int n) {
        int index = 1 + input.indexOf("1");
        return input.substring(0,index) + input.substring(index).replaceAll("1", "0");
    }
}
