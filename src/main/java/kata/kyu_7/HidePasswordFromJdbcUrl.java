package kata.kyu_7;


public class HidePasswordFromJdbcUrl {
    public static void main(String[] args) {
        System.out.println(hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=12345&user=root"));
    }

    public static String hidePasswordFromConnection(String urlString) {
        StringBuilder result = new StringBuilder(urlString);
        for (int i = result.indexOf("password=") + 9; i < result.length(); i++) {
            if (result.charAt(i) != '&' && result.charAt(i) != ' ') {
                result.setCharAt(i, '*');
            } else {
                break;
            }

        }
        return result.toString();
    }
}
