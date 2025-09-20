package kata.kyu_7;

public class DrivingSchoolSeries2 {

    public static void main(String[] args) {
        System.out.println(cost(1));
    }

    public static int cost(int mins){
        mins -= 60;
        return mins > 0 ? 30 + (mins / 30 * 10) + (mins % 30 > 5 ? 10 : 0) : 30;
    }
}
