package day14;

public class LC100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {       // Điều kiện dừng 1 : Nếu 2 gốc đều null thì = true
            return true;
        }
        if (p == null || q == null) {       // 2: 1 trong 2 gốc null thì khác cấu trúc -> false
            return false;
        }
        if (p.val != q.val) {               // 3: giá trị tại gốc # nhau -> false
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);      // sử dụng đệ quy đến hết các nhánh trái, phải
    }
    // Độ phức tạp khi sử dụng đệ quy là: 2^n
    // n = số lần rẽ node
}
