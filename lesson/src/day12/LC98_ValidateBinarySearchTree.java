package day12;

public class LC98_ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        return checkBST(root,2,7);
    }


    // Tạo hàm boolean truyền vào giá trị biến root, và giá trị trái phải để check theo điều kiện của 1 cây BST
    private static boolean checkBST(TreeNode root, Integer left, Integer right) {
        if (root == null) {  // Mặc định null thì là cây BST ( check đến lá cuối cùng, thoả mãn điều kiện thì sẽ = null và trả về true)
            return true;
        }
        if ((left != null && root.val <= left) || (right != null && root.val >= right)) {   // Cây BST thì trái sẽ phải <= root và phải >= root. Ngược lại thì sẽ ko phải -> trả về false
            return false;
        }
        // Trả về điều kiện của nhánh tiếp theo để check ( Đệ quy) // Cả 2 trả về true -> true
        return checkBST(root.left, left, root.val) && checkBST(root.right,root.val, right);
    }
}
