public class Person {
    public void XingXing(int z,boolean f){
        for(int x=1;x<=z;x++){
            if(!f){
                for(int j=1;j<=z-x;j++){
                    System.out.print(" ");
                }
            }
            for(int i=1;i<=x;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
