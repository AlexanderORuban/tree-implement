public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, new TreeNode(9, new TreeNode(5), new TreeNode(2)),
        new TreeNode(15, new TreeNode(-3), new TreeNode(5, null, new TreeNode(22))));
    System.out.println(root.value);
    System.out.println(root.left.value);
    System.out.println(root.left.left.value);
    System.out.println(root.left.right.value);
    System.out.println(root.right.value);
    System.out.println(root.right.left.value);
    System.out.println(root.right.right.value);
    System.out.println(root.right.right.right.value);
    System.out.println();

    TreeNode root1 = new TreeNode(77);
    root1.left = new TreeNode(22);
    root1.right = new TreeNode(86);
    root1.left.right = new TreeNode(33);

    System.out.println(root1.value);
    System.out.println(root1.left.value);
    System.out.println(root1.left.right.value);
    System.out.println(root1.right.value);
    System.out.println();

    preOrder(root);
    System.out.println();
    
    postOrder(root);
    System.out.println();

    inOrder(root);

  }

  public static void preOrder(TreeNode node) {
    if (node == null) {
      return;
    }

    System.out.println(node.value);

    preOrder(node.left);
    preOrder(node.right);

    return;
  }

  public static void postOrder(TreeNode node) {
    if (node == null) {
      return;
    }

    preOrder(node.left);
    preOrder(node.right);

    System.out.println(node.value);

    return;
  }

  public static void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }

    preOrder(node.left);

    System.out.println(node.value);

    preOrder(node.right);

    return;
  }
}
