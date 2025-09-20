package kata.kyu_7;

public class PrisonBreak {

    public static void main(String[] args) {
        System.out.println(freedPrisoners(new Boolean[]{true, true, false, false, false, true, false}));
    }

    public static int freedPrisoners(Boolean[] prison) {
        if (!prison[0]) {
            return 0;
        }
        int count = 0;
        boolean flag = true;
        for (Boolean aBoolean : prison) {
            if (aBoolean == flag) {
                count++;
                flag = !flag;
            }
        }
        return count;
    }
}
