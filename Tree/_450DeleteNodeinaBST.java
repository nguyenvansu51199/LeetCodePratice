package Tree;

public class _450DeleteNodeinaBST {

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
    public TreeNode nodeLeftMost(TreeNode root) {
      TreeNode temp = root;
      while (temp.left != null) {
        temp = temp.left;
      }
      return temp;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
      if (root == null) {
        return null;
      } else { // Tim key
        if (key < root.val) {
          root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
          root.right = deleteNode(root.right, key);
        } else { // xoa key, root.val == key
          // TH1: key la node la
          if (root.left == null && root.right == null) {
            return null;
          }
          // TH2: root co mot node ben trai
          if (root.left != null && root.right == null) {
            return root.left;
          }
          // TH2: root co mot node ben phai

          if (root.left == null && root.right != null) {
            return root.right;
          }

          // TH3: root co 2 node trai va phai
          // Chon node trai cung cua node ben phai
          // hoac chon node phai cung cua node ben trai

          if (root.left != null && root.right != null) { // Chon node trai cung cua node ben phai
            TreeNode nodeLeftMost = nodeLeftMost(root.right);

            root.val = nodeLeftMost.val;

            root.right = deleteNode(root.right, nodeLeftMost.val);
          }

        }

      }
      return root;
    }
  }
}
