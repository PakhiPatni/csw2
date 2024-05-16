package DataStructure;
class BSTNode {
    int info;
    BSTNode left;
    BSTNode right;

    public BSTNode(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

    public void insert(int value) {
        if (value < info) {
            if (left == null) {
                left = new BSTNode(value);
            } else {
                left.insert(value);
            }
        } else if (value > info) {
            if (right == null) {
                right = new BSTNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    public void preOrderTraversal() {
        System.out.print(info + " ");
        if (left != null) left.preOrderTraversal();
        if (right != null) right.preOrderTraversal();
    }

    public void inOrderTraversal() {
        if (left != null) left.inOrderTraversal();
        System.out.print(info + " ");
        if (right != null) right.inOrderTraversal();
    }

    public void postOrderTraversal() {
        if (left != null) left.postOrderTraversal();
        if (right != null) right.postOrderTraversal();
        System.out.print(info + " ");
    }
}

public class prog2 {
    public static void main(String[] args) {
        BSTNode root = new BSTNode(50);
        root.insert(40);
        root.insert(60);
        root.insert(80);
        root.insert(70);
        root.insert(30);
        root.insert(90);

        System.out.println("Pre-order traversal:");
        root.preOrderTraversal();
        System.out.println();

        System.out.println("In-order traversal:");
        root.inOrderTraversal();
        System.out.println();

        System.out.println("Post-order traversal:");
        root.postOrderTraversal();
        System.out.println();
    }
}


/**
 * OUTPUT
 * 
 * Pre-order traversal:
 * 50 40 30 60 80 70 90
 * In-order traversal:
 * 30 40 50 60 70 80 90
 * Post-order traversal:
 * 30 40 70 90 80 60 50 
 */