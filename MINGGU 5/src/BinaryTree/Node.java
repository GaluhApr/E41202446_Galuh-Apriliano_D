package BinaryTree;

public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node righChild;

    public void displayNode() {
        System.out.print("{"+id+","+data+")");
    }
}
