package day03;

import java.util.Scanner;

public class Work05 {
    public static void main(String[] args) {
       /* 5)用户登录，提示用户输入用户名和密码，
        如果用户名和密码不是"admin"和"123"的话，就提示用户继续输入，最多输入五次。*/
        Scanner scanner=new Scanner(System.in);
        int i=0;
        for (; i <5 ; i++) {
            System.out.println("请输入用户名");
            String username=scanner.next();
            System.out.println("请输入密码");
            String password=scanner.next();
            if ("admin".equals(username)&&"123".equals(password) ) {
                System.out.println("登陆成功,欢迎"+username);
                break;
            }else {
                System.out.println("用户名或者密码不正确,请重新输入");
            }
        }
        if (i == 5) {
            System.out.println("您今天已经输错五次，账号已被锁定，请稍后再尝试");
        }

    }
}
