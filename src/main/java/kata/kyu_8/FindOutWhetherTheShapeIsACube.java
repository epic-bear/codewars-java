package kata.kyu_8;

public class FindOutWhetherTheShapeIsACube {

    public static void main(String[] args) {
        System.out.println(isCube(12, 2));
    }

    public static boolean isCube(int volume, int side) {
        return volume > 0 && side > 0 && volume == Math.pow(side, 3);
    }
}
