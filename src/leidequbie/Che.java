package leidequbie;

public class Che extends CheLunzi{
    public Che(){
        System.out.println("车");
    }

    public static void main(String[]args){
        Object a = new Che();
        ((Che) a).Lunzi();
    }
}
