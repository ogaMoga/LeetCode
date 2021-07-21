package easy;

import javax.swing.*;

class TreeNode {
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

public class IncreasingOrderSearchTree {
    private TreeNode result;
    private TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        bst(root);
        TreeNode res = result;
        result = null;
        current = null;
        return res;
    }

    private void bst(TreeNode node) {
        if (node == null) {
            return;
        }
        bst(node.left);

        if (current == null) {
            result = node;
            current = node;
        } else {
            current.right = new TreeNode(node.val, null, node.right);
            current = current.right;
        }

        bst(node.right);
    }
}
