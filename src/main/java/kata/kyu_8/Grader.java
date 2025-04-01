package kata.kyu_8;

public class Grader {

    public static void main(String[] args) {
        System.out.println(grader(1.1));
    }

    public static String grader(double score){
        return score < 0.6 || score > 1 ? "F" :
               score >= 0.9 ? "A" :
               score >= 0.8 ? "B" :
               score >= 0.7 ? "C" : "D";
    }
}
