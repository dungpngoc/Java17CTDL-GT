package day12;

public class LC701_InsertintoaBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return root;
        }
        // root != null
        // Tìm vị trí để add newNode vào
        TreeNode current = root;
        while (true) {
            // nếu val > root
            // -> xét subtree bên phải
            if (val > current.val) {
                // xét subtree bên phải
                // nếu subtree bên phải null
                if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    // di chuyển xuống subtree bên phải
                    current = current.right;
                }
            } else {
                // xét subtree bên phải
                if (current.left == null) {
                    // nối luôn left vào newNode
                    current.left = newNode;
                    break;
                } else {
                    // di chuyển xuống subtree left để duyệt
                    current = current.left;
                }
            }
        }
        return root;
    }
}
