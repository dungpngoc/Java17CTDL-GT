package day12;

public class LC112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false; // nếu cây rỗng, trả về false
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true; // nếu đây là nút lá và tổng giá trị của đường đi từ gốc đến nút lá bằng với giá trị target, trả về true
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        // kiểm tra tiếp tục với các nút con bên trái và bên phải
        // và target tiếp theo = target - giá trị root hiện tại
    }
}
