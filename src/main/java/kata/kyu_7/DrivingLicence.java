package kata.kyu_7;

import java.util.List;

public class DrivingLicence {

    public static void main(String[] args) {
        System.out.println(driver(new String[]{"Issac", "", "Mireya", "21-May-1934", "M"}));
    }

    public static String driver(final String[] data) {
        int month = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
                .indexOf(data[3].substring(3, 6)) + 1;
        String result = "";
        result += data[2].length() < 5 ? data[2] + "9".repeat(5 - data[2].length()) : data[2].substring(0, 5);
        result += data[3].charAt(data[3].length() - 2);
        result += data[4].equals("F") ? 50 + month : month < 10 ? "0" + month : month;
        result += data[3].substring(0, 2) + data[3].charAt(data[3].length() - 1) + data[0].charAt(0);
        result += data[1].isEmpty() ? "9" : data[1].charAt(0);
        return result.toUpperCase() + "9AA";
    }
}
