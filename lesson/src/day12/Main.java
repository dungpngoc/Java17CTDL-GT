package day12;

import com.sun.source.tree.Tree;

public class Main {
    //              5
    //            /   \
    //          1       6
    //        /   \   /   \
    //       0     3 2     4

    public static void main(String[] args) {
        MyBinaryTree myTree = new MyBinaryTree();
        myTree.init();
        System.out.println("Done");


        // Thêm một node vào cây BST ( Vòng lặp)
        MyBST myBST = new MyBST();
//        myBST.mRoot = myBST.insert(myBST.mRoot,5);
//        myBST.mRoot = myBST.insert(myBST.mRoot,1);
//        myBST.mRoot = myBST.insert(myBST.mRoot,6);
//        myBST.mRoot = myBST.insert(myBST.mRoot,0);
//        myBST.mRoot = myBST.insert(myBST.mRoot,3);
//        myBST.mRoot = myBST.insert(myBST.mRoot,7);
//        myBST.mRoot = myBST.insert(myBST.mRoot,2);
//        myBST.mRoot = myBST.insert(myBST.mRoot,4);


        // Thêm một node vào cây BST ( Đệ quy)

//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,5);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,1);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,6);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,0);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,3);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,7);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,2);
//        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot,4);
//
//        System.out.println("Done");

        // Xoá một node trên cay BST
//        myBST.deleteNode(myBST.mRoot,1);

        // Duyệt cây theo 3 thứ tự
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n2.right = n5;

        MyBST.preOrder(n0);

        System.out.println("Done");
    }

    private static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val + "->");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
    }

    private static void postorder(TreeNode root) {
        if (root == null) {

        }
    }
}
