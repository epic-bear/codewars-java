package kata.kyu_7;

public class MultiplicationGenerators {

    private class Generator {

        private final int a;
        private int num = 0;

        private Generator(int a) {
            this.a = a;
        }

        public Generator of(int a) {
            return new Generator(a);
        }

        public String next() {
            num++;
            return a + " x " + num + " = " + a * num;
        }
    }
}
