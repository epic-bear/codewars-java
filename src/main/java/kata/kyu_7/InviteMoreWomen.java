package kata.kyu_7;

import java.util.Arrays;

public class InviteMoreWomen {

    public static void main(String[] args) {
        System.out.println(inviteMoreWomen(new int[] {1, -1, 1}));
    }

    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0;
    }
}
