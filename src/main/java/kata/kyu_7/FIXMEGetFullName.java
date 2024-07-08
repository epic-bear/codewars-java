package kata.kyu_7;

public class FIXMEGetFullName {

    public static void main(String[] args) {
        System.out.println(new Dinglemouse("", "XXX").getFullName());
    }

    public static class Dinglemouse {

        private final String firstName;
        private final String lastName;

        public Dinglemouse(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return (firstName + " " + lastName).trim();
        }
    }
}
