package Tree;

import java.util.Stack;

public class _98ValidateBinarySearchTree {

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

  // V1 use recursion
  // class Solution {
  // public boolean isValidBST(TreeNode root) {
  // return checkNode(root, null, null);
  // }

  // public boolean checkNode(TreeNode curNode, TreeNode minNode, TreeNode
  // maxNode) {
  // if (curNode == null)
  // return true;

  // if (minNode != null && curNode.val <= minNode.val)
  // return false;

  // if (maxNode != null && curNode.val >= maxNode.val)
  // return false;

  // boolean isLeft = checkNode(curNode.left, minNode, curNode);
  // boolean isRight = checkNode(curNode.right, curNode, maxNode);

  // return isLeft && isRight;
  // }
  // }

  // V2 use Stack
  class Solution {

    Stack<TreeNode> stack = new Stack<>();
    Stack<TreeNode> minStack = new Stack<>();
    Stack<TreeNode> maxStack = new Stack<>();

    public boolean isBST(TreeNode curNode, TreeNode minNode, TreeNode maxNode) {
      if (curNode == null)
        return true;
      if (minNode != null && curNode.val <= minNode.val)
        return false;
      if (maxNode != null && curNode.val >= maxNode.val)
        return false;
      return true;
    }

    public void addToStacks(TreeNode curNode, TreeNode minNode, TreeNode maxNode) {
      stack.push(curNode);
      minStack.push(minNode);
      maxStack.push(maxNode);
    }

    public boolean isValidBST(TreeNode root) {
      stack.push(root);
      minStack.push(null);
      maxStack.push(null);

      while (stack.isEmpty() == false) {
        TreeNode curNode = stack.pop();
        TreeNode minNode = minStack.pop();
        TreeNode maxNode = maxStack.pop();

        if (curNode == null) {
          continue;
        }

        if (isBST(curNode, minNode, maxNode) == true) {
          addToStacks(curNode.left, minNode, curNode);
          addToStacks(curNode.right, curNode, maxNode);
        } else {
          return false;
        }
      }
      return true;
    }
  }
}
