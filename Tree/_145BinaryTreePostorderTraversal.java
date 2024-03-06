package Tree;

import java.util.ArrayList;
import java.util.List;

public class _145BinaryTreePostorderTraversal {

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

    public List<Integer> postorderTraversal(TreeNode root) {
      if (root == null)
        return myList;

      postorderTraversal(root.left);
      postorderTraversal(root.right);
      myList.add(root.val);
      return myList;
    }
  }
}
