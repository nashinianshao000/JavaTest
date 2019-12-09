package zifuclianxi;

public class a1 {
    public String reverse(String s){
        char[] chars = s.toCharArray();
        String reverse = "";
        for(int i =chars.length-1;i>=0;i--){
            reverse += chars[i];
        }
        return reverse;
    }
    public String addre(String s){
        String sre = this.reverse(s);
        String v = s+sre;
        return v;
    }
    public Boolean ishuiwen(String s){
        char[] chars = s.toCharArray();
        for(int i =0;i<=chars.length-1;i++){
            if (chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public String youyi(String s,int a){
        String v = "";
        String youyi = "";
        char[] chars = s.toCharArray();
        for(int i =0;i<=chars.length-1;i++){
            if(i>=chars.length-a){
                youyi += chars[i];
            }
            else{
                v += chars[i];
            }

        }
        return youyi+v;
    }
    public String maxlength(String[] strings){
        String str1 = "";
        for(int i =0;i<=strings.length-1;i++){
            String str = strings[i];
            if (str.length()>str1.length()){
                str1 = str;
            }
        }
        return str1;
    }
    public int count(String str,String c){
        char[] chars = str.toCharArray();
        int v = 0;
        for (int i=0;i<=str.length()-1;i++){
            if (c.equals(""+chars[i])){
                v+=1;
            }
        }
        return v;
    }
    public String firstupper(String str){
        char[] chars = str.toCharArray();
        int is_kongge = 0;
        for (int i=0;i<=str.length()-1;i++){
            if (i==0){
                chars[i] = Character.toUpperCase(chars[i]);
                is_kongge =0;
            }
            if (is_kongge==1){
                chars[i] = Character.toUpperCase(chars[i]);
                is_kongge =0;
            }
            if (" ".equals(""+chars[i])){
                is_kongge =1;
            }
        }
        return String.valueOf(chars);
    }
    public int getallnum(String str){
        String v = "";
        char[] chars = str.toCharArray();
        for (int i=0;i<=str.length()-1;i++){
            if (Character.isDigit(chars[i])) {
                v+=chars[i];
            }
        }
        return Integer.valueOf(v);
    }
    public static void main(String[] args) {
        a1 a1 = new a1();
        System.out.println(a1.reverse("ok"));
        System.out.println(a1.addre("ok"));
        System.out.println(a1.ishuiwen("abcba"));
        System.out.println(a1.youyi("helloworld",2));
        String[] arr = {"ab","abc","abcd"};
        System.out.println(a1.maxlength(arr));
        System.out.println(a1.count("this is a test of java","a"));
        System.out.println(a1.firstupper("this is a test of java"));
        System.out.println(a1.getallnum("za1o1zbp24tcq"));

    }


}
