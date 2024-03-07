package kata.kyu_7;

public class YouCantDoThatOnTelevision {

    public static void main(String[] args) {
        System.out.println(bucketOf("I don't know if I'm doing this right."));
    }

    public static String bucketOf(String said) {
        said = said.toLowerCase();
        boolean water = said.matches(".*(water|wet|wash)+.*");
        boolean slime = said.toLowerCase().matches(".*(i don\\'t know|slime)+.*");
        if (water && slime) {
            return "sludge";
        } else if (water) {
            return "water";
        } else if (slime) {
            return "slime";
        } else {
            return "air";
        }
    }
}
