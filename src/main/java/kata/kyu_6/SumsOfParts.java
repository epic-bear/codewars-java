package kata.kyu_6;

public class SumsOfParts {

    public static int[] sumParts(int[] ls) {
        int [] result = new int[ls.length+1];

        int sum = 0;
        int v = 0;
        for (int l : ls) {
            sum += l;
        }
        for (int i = 0; i <ls.length ; i++) {
            result[i]=sum-v;

            v +=ls[i];
        }
        return result;
    }
}
