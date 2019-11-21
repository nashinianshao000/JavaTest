package lianshijiegou;

public class ChunZhi implements Arraybox{
    private Node last;
    private Node first;
    private int size;
    private void A(int element){
        Node l =last;
        Node newnode = new Node(l,element,null);
        last = newnode;
        if (l==null){
            first =newnode;
        }
        else{
            l.next = newnode;
        }

    }

    private Node B(int index){
        Node yuansu=first;
        if(index<(size>>1)){
            for(int x=0;x<index;x++){
                yuansu=yuansu.next;
            }
        }
        else{
            yuansu=last;
            for(int x=size;x>index+1;x--){
                yuansu=yuansu.prev;
            }
        }
        return yuansu;
    }
    private int C(Node node){
        int a = node.element;
        Node i = node.prev;
        Node j = node.next;
        if(i==null){
            first =j;
        }else{
            i.next =j;
            node.prev =null;
        }
        if(j==null){
            last=i;
        }
        else {
            j.prev = i;
            node.next = null;
        }
        size--;
        return a;
    }
    public void panduansuoyin(int index){
        if(index<0||index>size-1){
            System.out.println("索引位置有误");
        }
    }
    public boolean Add(int element) {
        this.A(element);
        size++;
        return true;
    }
    public int Delete(int index) {
        this.panduansuoyin(index);
        Node node = this.B(index);
        return C(node);
    }
    public int Select(int index) {
        this.panduansuoyin(index);
        int a = this.B(index).element;
        return a;
    }
    public int bianli() {
        return size;
    }
}
