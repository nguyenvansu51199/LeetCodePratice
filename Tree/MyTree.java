package Tree;

public class MyTree {
  class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
      this.val = val;
    }
  }

  // Pre-order Traversal: [ Node -> L -> R ]

  public static void preOrder(Node root) {
    if (root == null) {
      return;
    } else {
      System.out.println("root: " + root.val);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  // In-order Traversal: [ L -> Node -> R ]
  public static void inOrder(Node root) {
    if (root == null) {
      return;
    } else {
      preOrder(root.left);
      System.out.println("root: " + root.val);
      preOrder(root.right);
    }
  }

  // Post-order Traversal: [ L -> R -> Node
  public static void postOrder(Node root) {
    if (root == null) {
      return;
    } else {
      preOrder(root.left);
      preOrder(root.right);
      System.out.println("root: " + root.val);
    }
  }
}
