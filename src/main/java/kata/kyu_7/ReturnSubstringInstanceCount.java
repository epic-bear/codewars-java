package kata.kyu_7;

public class ReturnSubstringInstanceCount {
    public static void main(String[] args) {
        System.out.println(substringCount("abcdeb", "b"));
    }

    public static int substringCount(String fullText, String search) {
        return (fullText.length() - fullText.replaceAll(search, "").length()) / search.length() ;
    }
}
