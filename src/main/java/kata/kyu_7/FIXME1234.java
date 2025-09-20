package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;

public class FIXME1234 {

    public static void main(String[] args) {
        System.out.println(Dinglemouse.getNumber("one"));
    }

    public class Dinglemouse {

        static final Map<String, MyNumber> cache = new HashMap<>();

        static {
            MyNumber one = MyNumber.ONE;
        }

        enum MyNumber {
            ONE(1, "one", "ichi", "un"),
            TWO(2, "two", "ni", "deux"),
            THREE(3, "three", "san", "trois"),
            FOUR(4, "four", "shi", "quatre");

            private final int val;

            MyNumber(int val, String... names) {
                this.val = val;
                for (final String n : names)
                    cache.put(n, this);
            }

            public int intValue() {
                return this.val;
            }

        }

        static MyNumber getNumber(final String name) {
            return cache.get(name);
        }
    }
}
