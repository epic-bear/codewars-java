package kata.kyu_7;


public class TVRemote {

    public static void main(String[] args) {
        System.out.println(tvRemote("codewars"));
    }

    public static int tvRemote(String word) {
        char [][] k = new char[][] {new char[] {'a','b','c','d','e','1','2','3'},
                                    new char[] {'f','g','h','i','j','4','5','6'},
                                    new char[] {'k','l','m','n','o','7','8','9'},
                                    new char[] {'p','q','r','s','t','.','@','0'},
                                    new char[] {'u','v','w','x','y','z','_','/'}};
        int presses = 0;
        int currentI = 0;
        int currentJ = 0;

        for (char c : word.toCharArray()) {
            for (int i = 0; i < k.length; i++) {
                for (int j = 0; j < k[i].length; j++) {
                    if (k[i][j] == c) {
                        presses += Math.abs(currentI - i) + Math.abs(currentJ - j) + 1;
                        currentI = i;
                        currentJ = j;
                    }
                }
            }
        }
        return presses;
    }
}
