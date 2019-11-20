package leidequbie;

public class DianNao {
    private int zt = 2;
    void kaiji() {
        System.out.println("open");
        zt = 1;
    }
    void guanji(){
        System.out.println("close");
        zt =2;
    }
    void zhuangtai(){
        switch (zt){
            case 1:System.out.println("opening");break;
            case 2:System.out.println("closeing");break;
        }
    }
    public static void main(String[] args) {

    }
}
