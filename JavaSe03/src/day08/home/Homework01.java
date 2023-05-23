package day08.home;

import java.util.*;

/**
 * 模拟用户注册与登录使用Map存储
 * 运行程序后,显示操作界面:   1 注册       2 登录      3退出请输入你的操作: 1---------注册--------------请输入用户名: lisi该用户名已存在,请重新输入: wangwu请输入密码: 666注册成功注册后再回到操作界面:   1 注册       2 登录      3退出请输入你的操作: 2---------登录--------------请输入用户名:  wangwu请输入密码: 666用户登录成功
 */
public class Homework01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("张三", "123456");
        map.put("花木兰", "JIAqiang");
        map.put("小明", "jkl123");
        map.put("老六", "1888888");
        String username = null;
        String pass = null;
        Scanner sca = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------------------------------欢迎进入学生管理系统首页,请选择你要进行的操作-----------------");
            System.out.println(" -                                                                       -");
            System.out.println(" -                                                                       -");
            System.out.println(" ----------------------------------------------       1 注册             -----------");
            System.out.println(" ----------------------------------------------       2 登录             -----------");
            System.out.println(" ----------------------------------------------       3退出              ------------");
            System.out.println(" -                                                                       -");
            System.out.println(" -                                                                       -");
            System.out.println(" ----------------------------------------请输入你的操作: -----------------------------------");
            String num = sca.next();
            if ("1".equals(num)) {
                while (true) {
                    System.out.println("------------欢迎进入用户注册界面-------------");
                    System.out.println("请输入您的用户名");
                    username = sca.next();
                    if (!isaddUser(username, map)) {
                        System.out.println("用户名已存在,换一个吧");
                        continue;
                    }
                    System.out.println("请输入您的密码");
                    pass = sca.next();
                    map.put(username, pass);
                    System.out.println("恭喜你注册成功了, 赶快去登录吧");
                    break;
                }
            } else if ("2".equals(num)) {
                while (true) {
                    System.out.println("------------欢迎进入用户登录界面-------------");
                    System.out.println("请输入您的用户名");
                    username = sca.next();
                    System.out.println("请输入您的密码");
                    pass = sca.next();
                    if (map.containsKey(username)&& pass.equals(map.get(username))) {
                        System.out.println("登录成功!");
                        System.out.println("欢迎用户" + username + " ");
                        showall(map);
                        return;
                    } else {
                        System.out.println("用户或密码错误,请重新登录");
                        continue;
                    }
                }

            } else {
                return;
            }

        }
    }

    private static void showall(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    private static boolean isaddUser(String username, HashMap<String, String> map) {
        if (map.containsKey(username)) {
            return false;
        }
        return true;
    }
}
