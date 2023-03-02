package day12;


import java.util.ArrayList;
import java.util.List;

public class MyBST {
    public TreeNode mRoot;

    public MyBST() {

    }

    //    public TreeNode insert(TreeNode root, int value) {
//        TreeNode newNode = new TreeNode(value);
    // Cách 1: Thêm một node vào cây BST( Vòng lặp)
    // TH1: root == null
//        if (root == null) {
//            root = newNode;
//            return root;
//        } else {
//            TreeNode temp = root;
//            while (true) {
//                if (value > temp.val) {
//                    if (temp.right == null) {
//                        temp.right = newNode;
//                        break;
//                    } else {
//                        temp = temp.right;
//                    }
//                } else { // value < temp.val
//                    if (temp.left == null) {
//                        temp.left = newNode;
//                        break;
//                    } else {
//                        temp = temp.left;
//                    }
//                }
//            }
//            return root;
//        }
//    }
    // Cách 2: Thêm một node vào cây BST( Đệ quy)
    //
    public TreeNode insertIntoBST(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return new TreeNode(value);
        }

        if (value < rootNode.val) {
            if (rootNode.left == null) {
                rootNode.left = new TreeNode(value);
            } else {
                insertIntoBST(rootNode.left, value);
            }
        } else {
            if (rootNode.right == null) {
                rootNode.right = new TreeNode(value);
            } else {
                insertIntoBST(rootNode.right, value);

            }
        }
        return rootNode;
    }

    // Xoá một node khỏi cây BST
    // Tìm node trái cùng của 1 cây BST
    public TreeNode findLeftModeNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else { // root.val = key -> xoá root | Xác định được node xoá
            // B2 : Xoá node root

            // TH1 : root là node lá
            if (root.left == null && root.right == null) {
                return null;
            }
            // TH2 : chỉ có 1 con: bên trái
            if (root.left != null && root.right == null) {
                return root.left;
            }
            // TH2 : chỉ có 1 con: bên phải
            if (root.left == null && root.right != null) {
                return root.right;
            }
            // TH3 : Tồn tại 2 con
            // Tìm node trái cùng của cây con bên phải
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);

        }
        return root;
    }

    // Tìm một node trên cây BST
    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            return searchBST(root.left, key);
        } else if (key > root.val) {
            return searchBST(root.right, key);
        } else { // root.val = key
            return root;
        }
    }

    // Duyệt các phần tử trên cây
    // Cách 1: Node - L - R
    public static void preOrder(TreeNode currentNode) {
        if (currentNode == null) {
            return;
        }
        // Duyệt currentNode trước
        System.out.println(currentNode.val + " ");

        // Duyệt bên trái | Duyệt bên phải
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }

    // Cách 2:
    List<Integer> duyetOrder = new ArrayList<>();
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return duyetOrder;
        }
        // Duyệt currentNode trước
        duyetOrder.add(root.val);
        // Duyệt bên trái | Duyệt bên phải
        preOrder(root.right);
        preOrder(root.right);

        return duyetOrder;
    }

}
