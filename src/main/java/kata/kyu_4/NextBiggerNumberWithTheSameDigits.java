package kata.kyu_4;

import java.util.Arrays;

public class NextBiggerNumberWithTheSameDigits {

    public static long nextBiggerNumber(long n)
    {
        char [] array = String.valueOf(n).toCharArray();
        long result = -1;

        for(int i = array.length - 2; i >= 0; i--){
           if (array[i]<array[i+1]){
               int x = findMin(i,array);
               char a = array[i];
               array[i] = array[x];
               array[x] = a;
               Arrays.sort(array,i+1,array.length);
               result = Long.parseLong(String.copyValueOf(array));
               break;
           }
            }

        return result;
    }
    public static int findMin(int i,char[]chars){

        int min = 0;
        for (int j = chars.length-1; j > i ; j--) {
            if(chars[j]>chars[i]){

                return j;
            }
        }
        return min;
    }
}
