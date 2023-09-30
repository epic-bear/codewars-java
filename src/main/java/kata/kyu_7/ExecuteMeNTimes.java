package kata.kyu_7;

public class ExecuteMeNTimes {

    public static void main(String[] args) {
        execute(() -> System.out.println("run"), 3);
    }

    public static void execute(Runnable action, int nTimes) {
        for (int i = 0; i < nTimes; i++) {
            (new Thread(action)).start();
        }
        while (Thread.activeCount() > 1) {
        }
    }
}
