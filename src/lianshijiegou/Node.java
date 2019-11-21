package lianshijiegou;

public class Node {
    public Node next;
    public Node prev;
    public int element;
    public Node(Node prev,int element,Node next){
        this.prev = prev;
        this.element = element;
        this.next = next;
    }
}
