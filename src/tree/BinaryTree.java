package tree;

public class BinaryTree {
    TreeNode root;
    public void add(int val){
        insert(root, val);
    }
    public void insert(TreeNode node, int val) {
        if (node == null) {
            root = new TreeNode(val);
            return;
        }
        if (val < node.val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insert(node.left, val);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insert(node.right, val);
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Add some sample nodes
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.add(val);
        }
      InOrderTraversal o = new InOrderTraversal();
      //  o.inorderTraversal(tree.root);        // Call inorderTraversal
        MaxDepth  depth = new MaxDepth();
        depth.maxDepth(tree.root); // Call maxDepth

    }
}
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
