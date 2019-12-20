package ExaminationSystem;

import java.util.HashMap;

public class Login {

    private HashMap<String,String> h1 = new HashMap<>();
    {
        h1.put("xiaobu","123");
        h1.put("sunye","123");
        h1.put("gongcan","123");
    }
    public Boolean denglu(String user,String password){
        String a = h1.get(user);
        if (a!=null&&a.equals(password)){
            System.out.println("登陆成功");
            return true;
        }
        System.out.println("账号名或密码错误");
        return false;
    }

}
