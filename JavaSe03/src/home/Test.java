package home;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();
        Store store = new Store(list);
        store.getList().add(new Goods(1001, 100, "电脑", 6666));
        store.getList().add(new Goods(1005, 200, "手机", 4000));
        store.getList().add(new Goods(1002, 50, "耳机", 600));
        store.getList().add(new Goods(1004, 153, "键盘", 1200));
        store.isadd(new Goods(1004, 1444, "键盘", 1200));
       /* store.print();
        store.delete(1004);
        store.print();
        store.delete(1005);*/
        Scanner scanner = new Scanner(System.in);
        Boolean storeflag = true;
        while (true) {
            System.out.println("===================================电子商城===============");
            System.out.println("1 商家  2 客户 3 退出");
            System.out.println("请选择你的身份");
            String identity = scanner.next();
            if ("1".equals(identity)) {
                while (storeflag) {
                    System.out.println("======================电子商城后台管理===============");
                    System.out.println("1 添加商品  2.删除商品    3 查看商品   4 退出");
                    System.out.println("请选择你的操作");
                    String operate = scanner.next();
                    if ("1".equals(operate)) {
                        System.out.println("请输入添加的商品的编号");
                        int id = scanner.nextInt();
                        System.out.println("请输入添加的商品的名字");
                        String name = scanner.next();
                        System.out.println("请输入添加的商品的库存");
                        int count = scanner.nextInt();
                        System.out.println("请输入添加的商品的价格");
                        double price = scanner.nextDouble();
                        Goods goods = new Goods(id,count,name,price);
                        store.isadd(goods);
                    } else if ("2".equals(operate)) {
                        System.out.println("请输入要删除商品的编号");
                        int i = scanner.nextInt();
                        store.delete(i);
                    } else if ("3".equals(operate)) {
                        store.print();
                    } else {
                        storeflag = false;
                    }
                }
            }
            else if ("2".equals(identity)) {
                while (true) {
                    store.print();
                    System.out.println("1 购买商品   2.根据商品价格降序    3 根据商品编号升序   4 退出");
                    System.out.println("请选择你的操作");
                    String operate = scanner.next();
                    if ("1".equals(operate)) {
                        while (true) {
                            System.out.println("请输入购买商品的编号");
                            int id = scanner.nextInt();
                            if (store.issearch(id)) {
                            System.out.println("请输入购买的数量");
                            int count = scanner.nextInt();
                                store.total(id,count);
                            }else {

                            System.out.println("没有此款商品,请重新输入商品编号");
                            continue;
                            }
                            break;
                        }

                    }else if ("2".equals(operate)) {
                        store.sortPrinceDown();

                    }else if ("3".equals(operate)) {
                        store.sortIdUp();

                    }else if ("4".equals(operate)) {
                            return;
                    }

                }
            }
            else if ("3".equals(identity)) {
                return;
            }
            continue;
        }
    }
}
