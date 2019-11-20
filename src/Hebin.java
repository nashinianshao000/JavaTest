import java.util.*;
public class Hebin {
    public void H(int[] a,int[] b){
        int[] c = new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if (i<a.length){
                c[i]=a[i];
            }
            else{
                c[i]=b[i-a.length];
            }
        }
        for(int i:c){
            System.out.print(i);
        }
    }
    public void ChaiFen(int[] array){

        int max=array[0];
        int max_index =0;
        for(int i=0;i<array.length;i++){
            if(max<=array[i]){
                max=array[i];
                max_index = i;
            }
        }
        int[] a =new int[max_index];
        int[] b =new int[array.length-max_index-1];
        for(int i=0;i<max_index;i++){
            a[i]=array[i];
        }
        for(int i=0;i<array.length-max_index-1;i++){
            b[i]=array[array.length-max_index+i+1];
        }
        for(int i:a){System.out.print(i);}
        System.out.println("");
        for(int i:b){System.out.print(i);}

    }
    public void Qu0(int[] a){

        int array_length =a.length;
        for(int i:a){
            if (i==0){
                array_length-=1;
            }
        }
        int[] b = new int[array_length];
        int index =0;
        for(int i:a){
            if (i!=0){
                b[index]=i;
                index+=1;
            }
        }
        for(int i:b){
            System.out.print(i);
        }
    }
    public void ZhaoZhishu(int min,int max){
        int[] list = new int[max];
        int index =0;
        for(int i=min;i<=max;i++){
            for(int j=min;j<=i;j++){
                if(i%j==0){
                    break;
                }
                if(j==i-1){
                    list[index] = i;
                    index++;
                    break;
                }
            }
        }
        for(int i :list){
            System.out.print(i+",");
        }
    }
    public void Paixu(int[] array,String fs){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if (fs.equals("升")){
                    if (array[j]>array[j+1]){
                        int z = array[j];
                        array[j]=array[j+1];
                        array[j+1]=z;
                    }
                }
                else{
                    if (array[j]<array[j+1]){
                        int z = array[j];
                        array[j]=array[j+1];
                        array[j+1]=z;
                    }
                }
            }
        }
        for(int i:array){
            System.out.print(i+",");
        }
        System.out.println();
    }
    public void DengLu(String k,String v) {
        String[][] a ={{"a","1"},{"b","2"},{"c","3"}};
        boolean y =false;
        for(String[] i :a){
            if(i[0].equals(k)){
                if(i[1].equals(v)){
                    System.out.println("登录成功");
                    y=true;
                }
                break;
            }
        }
        if( !y ){
            System.out.println("用户名或密码错误");
        }
    }

}
