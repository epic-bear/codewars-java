package kata.kyu_7;

public class CuringArachnophobia {

    public static void main(String[] args) {
        System.out.println(drawSpider(2, 2, 'w', 'O'));
    }

    public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
        String eyes = String.valueOf(eye).repeat((int) (Math.pow(2, bodySize) / 2));
        String body = "(".repeat(bodySize) +  eyes + mouth + eyes + ")".repeat(bodySize);
        switch (legSize) {
            case 1:
                return String.format("^%s^", body);
            case 2:
                return String.format("/\\%s/\\", body);
            case 3:
                return String.format("/╲%s╱\\", body);
            default:
                return String.format("╱╲%s╱╲", body);
        }
    }
}
