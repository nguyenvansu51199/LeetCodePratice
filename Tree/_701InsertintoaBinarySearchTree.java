package Tree;

public class _701InsertintoaBinarySearchTree {

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
    public TreeNode insertIntoBSTV1(TreeNode root, int val) {
      TreeNode newNode = new TreeNode(val);
      if (root == null) {
        return newNode;
      } else {
        TreeNode temp = root;
        while (true) {
          if (val > temp.val) {
            if (temp.right == null) {
              temp.right = newNode;
              break;
            }
            temp = temp.right;
          } else {
            if (temp.left == null) {
              temp.left = newNode;
              break;
            }
            temp = temp.left;
          }
        }
        return root;
      }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
      TreeNode newNode = new TreeNode(val);

      if (root == null) {
        return newNode;
      }

      if (root.val > val) {
        if (root.left == null) {
          root.left = newNode;
        } else {
          insertIntoBST(root.left, val);
        }
      } else {
        if (root.right == null) {
          root.right = newNode;
        } else {

          insertIntoBST(root.right, val);
        }
      }

      return root;
    }
  }
}
