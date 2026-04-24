package kata.kyu_7;

public class RemoveBMW {
    public static void main(String[] args) {
        System.out.println(removeBMW("bbmmwwWWBBMM"));
    }
    public static String removeBMW(Object input) {
        if(input instanceof String){
            return ((String) input).replaceAll("[BbMmWw]","");
        }
        throw new IllegalArgumentException("This program only works for text.");
    }
}
