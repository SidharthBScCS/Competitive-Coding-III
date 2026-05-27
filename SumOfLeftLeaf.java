class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class SumOfLeftLeaf {
    public static int leftLeafSum(Node root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum = sum + root.left.data;
            }
        }
        sum = sum + leftLeafSum(root.left);
        sum = sum + leftLeafSum(root.right);

        return sum;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        

        int ans = leftLeafSum(root);
        System.out.println(ans);
    }
}
