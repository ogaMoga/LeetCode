package medium;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    private int currentIndex = 1;

    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(new TreeNode(preorder[0]), preorder,-1, Integer.MAX_VALUE);
    }

    private TreeNode bst(TreeNode treeNode, int[] elems, int min, int max) {
        while(currentIndex < elems.length && (treeNode.left == null || treeNode.right == null)) {
            int candidate = elems[currentIndex];
            if (candidate > max || candidate < min) {
                return treeNode;
            }
            currentIndex++;
            if (candidate > treeNode.val) {
                treeNode.right = bst(new TreeNode(candidate), elems, treeNode.val + 1, max);
            } else {
                treeNode.left = bst(new TreeNode(candidate), elems, min, treeNode.val - 1);
            }
        }
        return treeNode;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
