package kata.kyu_8;

public class TheIfFunction {

    public static void main(String[] args) {
        _if(true, () -> System.out.println("true"), () -> System.out.println("false"));
    }

    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if (bool != null && bool) {
            func1.run();
        } else {
            func2.run();
        }
    }
}
