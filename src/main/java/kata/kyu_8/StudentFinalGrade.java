package kata.kyu_8;

public class StudentFinalGrade {

    public static void main(String[] args) {
        System.out.println(finalGrade(100, 12));
    }

    public static int finalGrade(int exam, int projects) {
        if (exam > 90 || projects > 10) {
            return 100;
        } else if (exam > 75 && projects >= 5) {
            return 90;
        } else if (exam > 50 && projects >= 2) {
            return 75;
        } else {
            return 0;
        }
    }
}
