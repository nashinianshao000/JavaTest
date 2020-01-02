package IOtest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制文件夹
public class iotest3 {
    void bianli(String oldfpath,String  newfpath)throws IOException {
        File oldfile = new File(oldfpath);
        System.out.println("开始复制"+oldfile.getAbsolutePath());
        String[] e=oldfile.list();
        if(e!=null&&e.length!=0){
            File file1 = new File(newfpath);
            if (!file1.exists()){
                file1.mkdirs();
            }
            for(String a1:e){
                this.bianli(oldfile+"\\"+a1,newfpath+"\\"+a1);
            }
        }
        else{
            this.fuzhi(oldfpath,newfpath);
        }
        }
    void fuzhi(String oldtxt,String newtxt)throws IOException {
        FileInputStream fileInputStream = new FileInputStream(oldtxt);
        File file1 = new File(newtxt);
        if (!file1.exists()){
            file1.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(newtxt);
        byte[] a=new byte[5];
        int c = fileInputStream.read(a);
        while (c!=-1){
            String b=new String(a,0,c);
            fileOutputStream.write(b.getBytes());
            c = fileInputStream.read(a);
        }
        System.out.println(oldtxt+"成功复制到"+newtxt);
    }
    public static void main(String[] args) throws IOException {
        iotest3 iotest1 = new iotest3();
        iotest1.bianli("D:\\Test","D:\\Testnew");

    }

}
