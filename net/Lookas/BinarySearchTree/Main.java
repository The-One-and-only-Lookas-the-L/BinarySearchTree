package net.Lookas.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Character> tree = new BinarySearchTree<>('a');
        for(Character character : "CBVNDMFHGJTIURP".toCharArray()) {
            tree.addNode(new Node<>(character));
        }
        System.out.println("Nodes in the BinarySearchTree: "+tree.countNodes());
    }
}
