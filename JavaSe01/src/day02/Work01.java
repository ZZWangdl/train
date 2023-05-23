package day02;

import java.util.Scanner;

public class Work01 {
//    1、如果用户名等于”admin”，密码等于”123456”，则输出”欢迎您，admin”，否则输出”对不起，您不是admin”。
//
//

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入用户名");
    String username=scanner.next();
    System.out.println("请输入密码");
    String pass=scanner.next();
    if ("admin".equals(username)&&"123456".equals(pass)){
        System.out.println("欢迎您，admin");
    }else {
        System.out.println("对不起，您不是admin");
    }
}
}
