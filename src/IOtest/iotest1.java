package IOtest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//复制
public class iotest1 {

    void fuzhi()throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://Test//Test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D://Test//Test2.txt");
        byte[] a=new byte[5];
        int c = fileInputStream.read(a);
        while (c!=-1){
            String b=new String(a,0,c);
            fileOutputStream.write(b.getBytes());
            c = fileInputStream.read(a);
        }
    }
    public static void main(String[] args) throws IOException {
        iotest1 iotest1 = new iotest1();
        iotest1.fuzhi();

    }

}
