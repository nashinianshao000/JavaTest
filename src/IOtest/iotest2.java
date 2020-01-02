package IOtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//加密解密
public class iotest2 {

    void jiami()throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://Test//Test2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D://Test//Test3.txt");
        byte[] a=new byte[6];
        int c = fileInputStream.read(a);
        while (c!=-1){
            String b=new String(a,0,c);
            String bmi="xiaobu"+b;
            fileOutputStream.write(bmi.getBytes());
            c = fileInputStream.read(a);
        }
    }
    void jiemi()throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://Test//Test3.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D://Test//Test4.txt");
        byte[] a=new byte[6];
        int c = fileInputStream.read(a);
        while (c!=-1){
            String b=new String(a,0,c);
            if(b.equals("xiaobu")){
                c = fileInputStream.read(a);
                continue;
            }
            fileOutputStream.write(b.getBytes());
            c = fileInputStream.read(a);
        }
    }
    void gettest2()throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("D://Test//Test2.txt");
        String bmi="sunyesunyesunyesunyesunye";
        fileOutputStream.write(bmi.getBytes());


    }
    public static void main(String[] args) throws IOException {
        iotest2 iotest2 = new iotest2();
        iotest2.gettest2();
        iotest2.jiami();
        iotest2.jiemi();

    }

}
