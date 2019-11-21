package lianshijiegou;

public class Testc {
    public static void main(String[] args) {
        ChunZhi c = new ChunZhi();
        c.Add(0);
        c.Add(1);
        c.Add(2);
        c.Add(3);
        c.Add(4);
        c.Add(5);
        c.Add(6);
        System.out.println(c.Select(2));
        System.out.println(c.bianli());
        c.Delete(2);
        System.out.println(c.Select(2));
        System.out.println(c.bianli());
    }
}
