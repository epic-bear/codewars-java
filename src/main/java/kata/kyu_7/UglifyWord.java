package kata.kyu_7;


public class UglifyWord {

    public static void main(String[] args) {
        System.out.println(uglifyWord("AAA"));
    }

    public static String uglifyWord(String str) {
        boolean flag = true;
        String[] stringArr = str.split("");
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].replaceAll("[^a-zA-Z ]", "").length() == stringArr[i].length()) {
                if (flag) {
                    stringArr[i] = stringArr[i].toUpperCase();
                    flag = false;
                }
                else {
                    stringArr[i] = stringArr[i].toLowerCase();
                    flag = true;
                }
            } else {
                flag = true;
            }
        }
        return String.join("", stringArr);
    }
}
