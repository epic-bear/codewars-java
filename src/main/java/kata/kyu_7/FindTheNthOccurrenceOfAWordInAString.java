package kata.kyu_7;

public class FindTheNthOccurrenceOfAWordInAString {

    public static void main(String[] args) {
        System.out.println(findNthOccurrence("TestTest",
                "TestTestTestTest", 3));
    }

    public static int findNthOccurrence(String subStr, String str, int occurrence) {
        int count = 0;
        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            if (str.startsWith(subStr, i) && ++count == occurrence) {
                return i;
            }
        }
        return -1;
    }
}
