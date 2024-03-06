public class _104MaximumDepthofBinaryTree {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  class Solution {
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }

      int leftHight = maxDepth(root.left);
      int rightHight = maxDepth(root.right);

      int result = Math.max(leftHight, rightHight) + 1;
      return result;
    }
  }
}
