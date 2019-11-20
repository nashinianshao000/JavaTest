package leidequbie;

public class Jingche {
    private int sudu;
    public Jingche(){}
    public Jingche(int sudu){
        this.sudu=sudu;
    }
    public void zhuiji(Jiaoche jiaoche){
        System.out.println("警车开始追击");
        int jiaochesudu=jiaoche.getSudu();
        if(this.sudu>jiaochesudu){
            for (int x=0;x<=100;x++){
                if(sudu*x>=jiaochesudu*x+100){
                    System.out.println("追击时间："+x);
                    break;
                }
            }
        }
        else{
            System.out.println("追不上了");
        }
    }
}
