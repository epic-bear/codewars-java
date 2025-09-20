package kata.kyu_7;

public class CheckThreeAndTwo {

    public static void main(String[] args) {
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        String count = "";
        String string = String.valueOf(chars);

        count += string.length() - string.replaceAll("a", "").length();
        count += string.length() - string.replaceAll("b", "").length();
        count += string.length() - string.replaceAll("c", "").length();

        return count.contains("3") && count.contains("2");
    }
}
