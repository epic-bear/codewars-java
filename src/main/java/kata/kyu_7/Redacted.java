package kata.kyu_7;

public class Redacted {

    public static void main(String[] args) {
        System.out.println(
                redacted("Line1\n" +
                                "XLine2X",
                        "Line1\n" +
                                "\n" +
                                "Line2\n"));
    }

    public static boolean redacted(String doc1, String doc2) {
        doc1 = doc1.replaceAll("\n", "@");
        doc2 = doc2.replaceAll("\n", "@");
        if (doc1.length() != doc2.length()) {
            return false;
        } else {
            for (int i = 0; i < doc1.length(); i++) {
                if ((doc1.charAt(i) == 'X' && doc2.charAt(i) == '@') ||
                        (doc1.charAt(i) != 'X' && doc1.charAt(i) != doc2.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}

