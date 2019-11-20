public class Zhaojizhi {
    public void Z(int[] array){
        int max=array[0];
        int min=array[0];
        for(int i:array){
            if(max<=i){
                max=i;
            }
            if(min>=i){
                min=i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

