package kata.kyu_5;

import java.util.ArrayList;
import java.util.List;

public class FactorialDecomposition {

    public static String decomp(int n) {

        List<String> result = new ArrayList<>();

        int [] numbers = new int[n+1];

        for (int i=0;i<=n;i++) numbers[i] = i;

        for (int i=2;i<=n;i++) {

            if (numbers[i] == 1) continue;

            int count = 1;

            for (int j=i+1;j<=n;j++) {

                while(numbers[j]%i==0) {

                    numbers[j] = numbers[j] / i;

                    count++;
                }
            }
            result.add(i+(count==1?"":"^"+count));
        }
        return String.join(" * ", result);
    }
}
