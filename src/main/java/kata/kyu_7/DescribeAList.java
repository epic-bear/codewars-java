package kata.kyu_7;

import java.util.Arrays;
import java.util.List;

public class DescribeAList {

    public static void main(String[] args) {
        System.out.println(describeList(Arrays.asList(1, 2)));
    }

    public static String describeList(final List list) {
        return list.isEmpty() ? "empty" : list.size() == 1 ? "singleton" : "longer";
    }
}
