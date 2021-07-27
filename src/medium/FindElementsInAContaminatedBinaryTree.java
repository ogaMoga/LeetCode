package medium;

public class FindElementsInAContaminatedBinaryTree {
    // experimental implementation based on leetcode constraints. it is faster and takes less memory than hashset
    private final boolean[] elems = new boolean[20000001];
    public FindElementsInAContaminatedBinaryTree(TreeNode root) {
        bfs(root, 0);
    }

    public boolean find(int target) {
        return elems[target];
    }

    private void bfs(TreeNode node, int index) {
        node.val = index;
        elems[index] = true;
        if (node.left != null) {
            bfs(node.left, index * 2 + 1);
        }
        if (node.right != null) {
            bfs(node.right, index * 2 + 2);
        }
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
