package kata.kyu_7;

public class Null {
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        } else if (obj instanceof Null) {
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "null";
    }
}
