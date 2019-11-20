public class Shifoucunzai {
    public void Iscunzai(String a,String[] b){
        boolean f =true;
        for(String i:b){
            if(a.equals(i)){
                System.out.println("存在");
                f = false;
                break;
            }
        }
        if( f ){
            System.out.println("不存在");
        }

    }

}
