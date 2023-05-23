package day05.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 定义List集合存储整数向集合中添加 20 个[0,100)范围内的随机整数 判断是否包含 66 删除77 foreach遍历  删除所有小于 50 的整数
 */
public class HomeWork01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
     /*   for (int i = 0; i < 20; i++) {
            int rand = (int) (Math.random() * 100);
            if (!isreach(list, rand)) {
                list.add(rand);
            }
        }*/
        int i = 0;
        while (i<20){
            int rand = (int) (Math.random() * 100);
            if (!isreach(list, rand)) {
                list.add(rand);
                i++;
            }else {
                System.out.println("重复了");
            }
        }
       /* int num = 0;
        System.out.println(isreach(list, 66) ? "存在" : "集合当中不存在");
        delete(list, 77);
        deleteall(list, 50);*/
        System.out.println(list);
    }

    /**
     * 删除集合当中i以下的数
     *
     * @param list
     * @param i
     */
    private static void deleteall(List<Integer> list, int i) {

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (i > it.next()) {
                it.remove();
            }
        }
        System.out.println("删除" + i + "以下的数后的集合为" + list);
    }

    /**
     * 删除集合当中存在的num
     *
     * @param list
     * @param num
     */
    private static void delete(List<Integer> list, int num) {
        if (isreach(list, num)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                if (77 == it.next()) {
                    it.remove();
                    System.out.println(num + "已经删除了");
                }
            }
            return;
        }
        System.out.println(num + "没有在集合当中");

    }

    /**
     * 判断集合当中是否有num的存在
     *
     * @param list
     * @param num
     * @return
     */
    private static boolean isreach(List<Integer> list, int num) {
        for (Integer integer : list) {
            if (integer == num) {
                return true;
            }
        }
        return false;
    }
}
