package kata.kyu_7;

public class TheOfficeFindAMeeningRoom {

    public static void main(String[] args) {
        System.out.println(meeting(new char[] {'X', 'O', 'X'}));
    }

    public static Object meeting(char[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O') {
                return i;
            }
        }
        return "None available!";
    }
}
