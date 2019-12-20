package ExaminationSystem;

import java.util.*;

public class ExamMac {

    private HashMap<String,String[]> h1 = new HashMap<>();{
        String[] strings1= {"1","2","3","4","B"};
        h1.put("1+1=?",strings1);
        String[] strings2= {"1","2","3","4","C"};
        h1.put("1+2=?",strings2);
        String[] strings3= {"1","2","3","4","D"};
        h1.put("1+3=?",strings3);
        String[] strings4= {"1","2","3","5","D"};
        h1.put("1+4=?",strings4);
        String[] strings5= {"1","2","6","4","C"};
        h1.put("1+5=?",strings5);
        String[] strings6= {"7","2","1","4","A"};
        h1.put("1+6=?",strings6);
        String[] strings7= {"1","2","8","4","C"};
        h1.put("1+7=?",strings7);
        String[] strings8= {"9","2","8","4","A"};
        h1.put("1+8=?",strings8);
        String[] strings9= {"1","10","12","4","B"};
        h1.put("1+9=?",strings9);
        String[] strings10= {"1","2","11","4","C"};
        h1.put("1+10=?",strings10);
    }
    public Iterator<Map.Entry<String,String[]>> getTi(){
        Set<Map.Entry<String,String[]>> entrySet = h1.entrySet();
        Iterator<Map.Entry<String,String[]>> iterator = entrySet.iterator();
        return iterator;
    }
}
