package kata.kyu_7;


public class IBeforeEExceptAfterC {

    public static void main(String[] args) {
        System.out.println(iBeforeE("friend"));
    }

    public static String iBeforeE(String s) {
        while (s.contains("ei")) {
            s = s.replace("ei", "ie");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == 'c' && i + 1 < s.length()) {
                result.append('c');
                int j = i + 1;
                while (j < s.length() && (s.charAt(j) == 'i' || s.charAt(j) == 'e')) {
                    j++;
                }
                String group = s.substring(i + 1, j);
                long e = group.chars().filter(ch -> ch == 'e').count();
                long iCount = group.length() - e;
                result.append("e".repeat((int) e)).append("i".repeat((int) iCount));
                i = j;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
