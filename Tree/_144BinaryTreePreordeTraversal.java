package Tree;

import java.util.ArrayList;
import java.util.List;

public class _144BinaryTreePreordeTraversal {

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

    public List<Integer> preorderTraversal(TreeNode root) {
      if (root == null) {
        return myList;
      } else {
        myList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
      }
      return myList;
    }
  }
}
