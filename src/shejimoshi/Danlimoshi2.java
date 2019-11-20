package shejimoshi;

public class Danlimoshi2 {
//    懒汉式
    private Danlimoshi2(){}
    private static Danlimoshi2 duixiang;
    public static Danlimoshi2 getDx(){
        if (duixiang==null){
            duixiang = new Danlimoshi2();
        }
        return Danlimoshi2.duixiang;
    }
}
