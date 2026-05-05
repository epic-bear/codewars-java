package kata.kyu_7;

public class ValidateTheEuroBill {
    private static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        System.out.println(validateEuro("HG2015896213"));
    }

    public static boolean validateEuro(String serialNumber) {
        if (serialNumber.length() != 12 || !Character.isAlphabetic(serialNumber.charAt(0)) || !Character.isAlphabetic(serialNumber.charAt(1))) {
            return false;
        }
        int sum = letters.indexOf(serialNumber.charAt(0)) + letters.indexOf(serialNumber.charAt(1)) + 2;
        String res = serialNumber.substring(2);
        while (res.length() > 1) {
            for (String a : res.split("")) {
                sum += Integer.parseInt(a);
            }
            res = String.valueOf(sum);
            sum = 0;
        }

        return Integer.parseInt(res) == 7;
    }
}
