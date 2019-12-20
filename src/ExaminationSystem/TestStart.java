package ExaminationSystem;

import java.util.Scanner;

public class TestStart {
    public static void main(String[] args) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名：");
        String user = scanner.nextLine();
        System.out.println("输入密码：");
        String password = scanner.nextLine();
        Boolean isdenglu = login.denglu(user,password);
        if(isdenglu){
            System.out.println("开始答题：");
            Student student = new Student();
            int fen = student.dati();
            System.out.printf("考试结束!满分：100分，得分：%s分 \n",fen);
        }
    }
}
