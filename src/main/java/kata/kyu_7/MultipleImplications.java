package kata.kyu_7;


public class MultipleImplications {

    public static void main(String[] args) {
        System.out.println(multImplication(new boolean[]{false, true, false, false, true, false, false, false}));
    }

    public static Boolean multImplication(boolean[] lst) {
        if (lst.length == 0) {
            return null;
        }
        boolean result = lst[0];

        for (int i = 0; i < lst.length - 1; i++) {
            result = !(result && !lst[i + 1]);
        }

        return result;
    }
}
