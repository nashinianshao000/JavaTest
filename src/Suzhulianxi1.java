public class Suzhulianxi1 {
    public void Suzhu1(int[] a,int[] b){
        int[] c = new int[b.length];
            for(int i=0;i<b.length;i++){
            c[i]=b[i];
        }
        b=a;
        a=c;
            for(int i:a){
            System.out.print(i);
        }
            System.out.println();
            for(int i:b){
            System.out.print(i);
        }
    }
}
