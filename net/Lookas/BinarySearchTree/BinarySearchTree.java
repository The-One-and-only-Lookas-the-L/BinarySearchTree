package net.Lookas.BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {
    public Node<T> root = null;

    public BinarySearchTree(T rootData){
        this.root = new Node<>(rootData);
    }

    public void addNode(Node<T> n){
        this.root.addNode(n);
    }

    public void traverse(){
        this.root.visit();
    }

    public Node<T> search(T inputData){
        return this.root.search(inputData);
    }

    private int COUNTER = 0;
    private int countNodes(Node node){
        COUNTER++;
        if (node.left != null){
            countNodes(node.left);
        }
        if (node.right != null){
            countNodes(node.right);
        }
        return COUNTER;
    }


    /**
     * @return the number of all nodes in the tree, including the root node
     */
    public int countNodes(){
        COUNTER = 0;
        return countNodes(this.root);
    }
}
