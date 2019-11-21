package lianshijiegou;

public class ChunZhi implements Arraybox{
    private static Node last;
    private static Node first;
    private static int size;
    public ChunZhi(){
    }
    private static void A(int element){
        Node l =last;
        Node newnode = new Node(l,element,null);
        last = newnode;
        if (l==null){
            first =newnode;
        }
        else{
            l.next = newnode;
        }
        size++;

    }
    public boolean Add(int element) {
        ChunZhi.A(element);
        return true;
    }
    public int Remove() {
        return 0;
    }
    public int Delete() {
        return 0;
    }
    public int Select(int size) {
        return 0;
    }
}
