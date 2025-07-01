package tree;

public class InOrderTraversal {
    //Left Root Right
    public void inorderTraversal(TreeNode root) {
      if(root ==null)
          return ;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}
