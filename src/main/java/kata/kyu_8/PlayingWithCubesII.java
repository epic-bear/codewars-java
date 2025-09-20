package kata.kyu_8;

public class PlayingWithCubesII {

    public static void main(String[] args) {

    }

    class Cube {

        private int side;

        public Cube(int side) {
            this.side = Math.abs(side);
        }

        public Cube() {

        }

        public int getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = Math.abs(side);
        }
    }
}
