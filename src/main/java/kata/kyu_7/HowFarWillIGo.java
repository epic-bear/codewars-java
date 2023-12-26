package kata.kyu_7;

public class HowFarWillIGo {

    public static void main(String[] args) {
        System.out.println(travel(1000, 10, 127, 14));
    }

    public static int travel(int totalTime, int runTime, int restTime, int speed) {
        int distance = 0;
        while (totalTime > 0) {
            distance += totalTime <= runTime ? totalTime * speed : runTime * speed;
            totalTime -= runTime;
            totalTime -= restTime;
        }
        return distance;
    }
}
