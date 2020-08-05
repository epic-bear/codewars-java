package kata.kyu_7;

public class HalvingSum {
    int halvingSum(int n) {
        int sum = 0;
        while(n>0){
            sum += n;
            n = n/2;
        }
        return sum;
    }
}
