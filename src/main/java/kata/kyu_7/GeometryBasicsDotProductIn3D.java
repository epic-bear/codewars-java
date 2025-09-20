package kata.kyu_7;

public class GeometryBasicsDotProductIn3D {

    public static void main(String[] args) {
        System.out.println(dotProduct(new Vector3D(2, 0, -1), new Vector3D(0, -2, 1)));
    }

    public static double dotProduct(final Vector3D a, final Vector3D b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static class Vector3D {
        int x;
        int y;
        int z;

        public Vector3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
