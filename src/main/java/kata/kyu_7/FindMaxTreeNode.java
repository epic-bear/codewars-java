package kata.kyu_7;

public class FindMaxTreeNode {

    public static void main(String[] args) {
    }

    static int findMax(TreeNode  root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(findMax(root.left), findMax(root.right)));
    }

    private  class TreeNode {
        TreeNode  left;
        TreeNode  right;
        int value;
    }
}
