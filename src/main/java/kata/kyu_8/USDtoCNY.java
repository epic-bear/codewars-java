package kata.kyu_8;

import java.text.DecimalFormat;

public class USDtoCNY {

    public static void main(String[] args) {
        System.out.println(usdcny(15));
    }

    public static String usdcny(int usd) {
        return new DecimalFormat("0.00").format(usd * 6.75) + " Chinese Yuan";
    }
}
