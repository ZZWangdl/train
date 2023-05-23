package day01;

import java.util.*;

public class T {
    public static void main(String[] args) {
        //Scanner scanner=new Scanner(System.in);
       /* System.out.println("sfsdfsdf");
        int aa=scanner.nextInt();
        System.out.println("11111");
        String c=scanner.nextLine();
        System.out.println(123>0?"大于":"小于");
        int a =9;
        System.out.println(a+=a+a++);*/
       /* String str1=scanner.next();
        String str2=scanner.nextLine();//主要
        System.out.println(str1);
        System.out.println(str2);
        int a=5;
        System.out.println(a>=1&&a<4 ? "春":a>=4&&a<7?"夏":a>=7&&a<10?"秋":a>=10&&a<13?"冬":"没有这个月份");
        String ss=1>0?"sf":"132";
        System.out.println(1>0?"sf":132);*/
      /*  String aaa=scanner.next();
        System.out.println(aaa.equals("123"));
        System.out.println(aaa=="123");*/
    // T t = new T();
       // System.out.println(t.foo(5));
        Map <String,Object> map = new LinkedHashMap<>();
        List<Map<String,Object>> list = new LinkedList();
        list.add(map);
        map.put("aa",map.get("aa"));
        //System.out.println(map.get("aa").equals("2"));
                Map <String,Object> map1 = new LinkedHashMap<>();
        for (Object m:list) {
            if (m instanceof Map) {
                map1= (Map)m;
                System.out.println(44444);
            }
        }
    }
    static void pong() {
        System.out.print("pong");

    }

    int foo(int n) {
        if (n < 2) return n;
        return foo(n - 1) + foo(n - 2);
    }
}
