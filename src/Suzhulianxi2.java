public class Suzhulianxi2 {
    public void jizhi(int[] x){
        int y=x[0];
        for(int a=0;a<x.length;a++){
            if(x[a]>x[a+1]){
                y=x[a+1];
            }
        }
        System.out.println(y);
    }
    public static void main(String[]args){
        Suzhulianxi2 a=new Suzhulianxi2();
        int[] x={1,2,3,4,5,6};
        a.jizhi(x);
    }
}
