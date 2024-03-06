package Tree;

public class _112PathSum {
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

    public boolean isLeaf(TreeNode root) {
      return root.left == null && root.right == null;
    }

    public boolean loopTree(TreeNode curNode, int sum, int target) {
      if (curNode == null)
        return false;

      sum += curNode.val;

      if (isLeaf(curNode)) {
        if (sum == target)
          return true;
      }

      boolean loopLeft = loopTree(curNode.left, sum, target);
      boolean loopRight = loopTree(curNode.right, sum, target);

      return loopLeft || loopRight;

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
      return loopTree(root, 0, targetSum);
    }
  }
}
