package kata.kyu_7;

public class BasicsGenerators {

    private int count = 0;

    public int next() {
        return count++;
    }

    public int next(int n) {
        count = n;
        return count;
    }
}
