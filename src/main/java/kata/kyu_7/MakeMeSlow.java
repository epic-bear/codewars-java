package kata.kyu_7;

public class MakeMeSlow {

    public static void main(String[] args) {
        makeMeSlow();
    }

    public static void makeMeSlow(){
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
