package kata.kyu_7;

public class CountTheOnes {

    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
    }

    public static int hammingWeight(int i){
        return Integer.bitCount(i);
    }
}
