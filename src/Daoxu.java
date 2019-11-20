public class Daoxu {
    public void Dx(int[] a){
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i] = a[a.length-i-1];
        }
        for(int i:b){
            System.out.print(i);
        }
    }
}
