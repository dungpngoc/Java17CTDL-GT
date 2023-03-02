package day12;


public class LC450_DeleteNodeinaBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        // root != null
        if (key < root.val) {
            // xét bài toàn con subtree bên trái
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            // xét bài toán con subtree bên phải
            root.right = deleteNode(root.right, key);
        } else {
            // key == root.val
            if (root.left == null && root.right == null) {
                // null left
                return null;
            }
            // chỉ có 1 con
            if (root.left == null && root.right != null) {
                // null left
                return root.right;
            }
            if (root.left != null && root.right == null) {
                // null left
                return root.left;
            }

            // có 2 con
            int temp = findMinOfRightSubTree(root.right);
            root.val = temp;
            root.right = deleteNode(root.right,temp);
        }
        return root;
    }

    private static int findMinOfRightSubTree(TreeNode root) {
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.val;
    }
}
