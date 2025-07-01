package tree;

import java.util.List;

public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new java.util.ArrayList<>();

        //why this function?
        // result needs to be passed to the recursive function
        //why not set result as a field in the class?
        //code smell and separation of concerns - variable should not be shared across methods unless necessary
       preOrderRecursive(root, result);
       return result;

    }

    private void  preOrderRecursive(TreeNode root, List<Integer> result) {
        if( root == null){
            return ;
        }
        result.add(root.val); // Visit the root
        preOrderRecursive(root.left, result);  // Traverse the left subtree
        preOrderRecursive(root.right, result); // Traverse the right subtree
    }
}
