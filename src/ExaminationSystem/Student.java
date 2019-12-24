package ExaminationSystem;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public int dati(){
        ExamMac examMac = new ExamMac();
        Iterator<Map.Entry<String,String[]>> iterator = examMac.getTi();
        Teacher t = new Teacher();
        for(int i=0;i<5;i++){
            Map.Entry<String,String[]> entry = iterator.next();
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.printf("第%s题 %s 选择正确答案:\nA,%s  B,%s  C,%s  D,%s \n",i+1,key.substring(1),value[0],value[1],value[2],value[3] );
            Scanner scanner = new Scanner(System.in);
            String daan = scanner.nextLine();
            if (daan.equals(value[4])||daan.equals(value[4].toLowerCase())){
                t.pingfen();
            }
        }
        return t.fen;
}
}
