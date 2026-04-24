package kata.kyu_7;

public class LombokEncapsulation {
    public static void main(String[] args) {

    }

    public class EncapsulationDemo{
        private int number;

        public EncapsulationDemo() {
        }

        public EncapsulationDemo(int number, String stringValue, Object anObject) {
            this.number = number;
            this.stringValue = stringValue;
            this.anObject = anObject;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public Object getAnObject() {
            return anObject;
        }

        public void setAnObject(Object anObject) {
            this.anObject = anObject;
        }

        private String stringValue;
        private Object anObject;
    }
}
