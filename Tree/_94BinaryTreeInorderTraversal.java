package Tree;

import java.util.ArrayList;
import java.util.List;

public class _94BinaryTreeInorderTraversal {

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

    List<Integer> myList = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
      if (root == null)
        return myList;
      inorderTraversal(root.left);
      myList.add(root.val);
      inorderTraversal(root.right);

      return myList;
    }
  }
}
