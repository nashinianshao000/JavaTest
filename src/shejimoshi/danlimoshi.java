package shejimoshi;

public class danlimoshi {
//    饿汉式
    private danlimoshi(){}
    private static danlimoshi a = new danlimoshi();
    public static danlimoshi getA(){
        return a;
    }
}
