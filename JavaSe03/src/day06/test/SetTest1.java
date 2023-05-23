package day06.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试set集合
 */
public class SetTest1 {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        int i = 0;
        while (i<20){
            int rand = (int)(Math.random()*100);
            System.out.print(" "+rand);
          /*  if (set.add(rand)) {
                    i++;
                    continue;
            }*/
            //改进优化  size本身就是随元素的改变而改变
             if (set.size()<20) {
                set.add(rand);
            }
                System.out.println(" "+ rand);
        }
        System.out.println();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(" "+it.next());
        }

    }
}
