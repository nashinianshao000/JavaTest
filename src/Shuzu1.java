public class Shuzu1 {
    public int[][] jiaohuan(int[] a,int[] b){
        int[]c = a;
        a=b;
        b=c;
        int[][] result={a,b};
        return result;
    }
    public static void main(String[] args){
        Shuzu1 a=new Shuzu1();
        int[] x = {1,2,3,4};
        int[] y = {5,6,7,8,9};
        a.jiaohuan(x,y);

        int[][] value ={{}};
        x = value[0];
        y= value[1];
    }
}
