package kata.kyu_7;

public class SmokingTimmy {

    public static void main(String[] args) {
        System.out.println(startSmoking(1, 1));
    }

    public static int startSmoking(int bars,int boxes){
        int cigarettes = bars * 180 + boxes * 18;
        int stubs = cigarettes;
        while (stubs >= 5) {
            cigarettes += stubs / 5;
            stubs = stubs / 5 + stubs % 5;
        }
        return cigarettes;
    }
}
