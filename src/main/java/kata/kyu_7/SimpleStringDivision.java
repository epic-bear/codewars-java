package kata.kyu_7;

public class SimpleStringDivision {

    public static void main(String[] args) {
        System.out.println(solve("123", 1));
    }

    public static long solve(String st, int k) {
        int maxPartition = 0;
        int length = st.length() - k;

        for (int i = 0; i <= st.length() - length; i++) {
            int partition = Integer.parseInt(st.substring(i, i + length));
            if (partition > maxPartition) {
                maxPartition = partition;
            }
        }
        return maxPartition;
    }
}
