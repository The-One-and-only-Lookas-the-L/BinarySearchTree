package net.Lookas.BinarySearchTree;

public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public void addNode(Node<T> node){
        int compared = this.data.compareTo(node.data);
        if (compared > 0){ // if greater
            if (this.left == null){
                this.left = node;
            } else {
                this.left.addNode(node);
            }
        } else if (compared < 0){ // if less
            if (this.right == null){
                this.right = node;
            } else {
                this.right.addNode(node);
            }
        }
    }
    public void visit(){
        if (this.left != null){ this.left.visit(); }

        System.out.println("Data: "+this.data);

        if (this.right != null){ this.right.visit(); }
    }
    public Node<T> search(T inputData){
        int compared = inputData.compareTo(this.data);
        if (compared > 0) {
            if (this.right != null) {
                return this.right.search(inputData);
            }
        } else if (compared < 0){
            if (this.left != null) {
                return this.left.search(inputData);
            }
        } else {
            return this;
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    @Override
    public String toString(){
        T rData = (T) "null";
        T lData = (T) "null";
        if (this.right != null){
            rData = this.right.data;
        }
        if (this.left != null){
            lData = this.left.data;
        }
        return "Node{data='"+this.data+"', left='"+lData+"', right='"+rData+"'}";
    }

}
