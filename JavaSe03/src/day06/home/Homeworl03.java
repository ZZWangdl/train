package day06.home;

import java.io.OutputStream;
import java.util.*;

/**
 * 模拟生成一 注双色球有6个红色与一个蓝色球组成红色球在1~33范围内, 蓝色在1~16范围内红色号码不重复
 */
public class Homeworl03 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 1;
        while (map.size() < 6) {
            int i = (int) (Math.random() * 33) + 1;
            if (!map.containsValue(i)) {
                map.put(j++, i);
            }
        }
        int i = (int) (Math.random() * 16) + 1;//生成双色球
        map.put(j++, i);
        int[] nums = new int[7];
        myGuess(nums);
       winPrize(map,nums);
       print(map,nums);


    }

    /**
     * 判断输入是否合理 不符合要求重写输入 符合就直接写人数组中(红色球1-33不可以重复 蓝色球1-16 可以与红色球重复)
     * @param nums
     */
    public  static void myGuess(int[] nums){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要填写的双色球数(前六个数是红色(1-33),最后一个是蓝色(1-16),且不能重复)");
        int count = 0;
        while (count < 7) {
            boolean flag = false;
            System.out.println("请输入第" + (count + 1) + "个数字");
            int num = scanner.nextInt();
            if (count == 0) {
                nums[count] = num;
                count++;
                continue;
            }
            if (count == 6) {
                if (num >= 1 && num < 17) {
                    nums[count] = num;
                    count++;
                }
            }
            for (int k = 0; k < nums.length; k++) {
                if (num == nums[k]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) continue;
            if (num > 1 && num < 34) {
                nums[count] = num;
                count++;
            }
        }

    }
    /**
     * 判断是否中奖
     * @param map
     * @param nums
     */
    public  static void winPrize(HashMap<Integer,Integer> map,int[] nums){
        int total=0;
        for (int k = 0; k < nums.length; k++) {
            if (map.get(k+1)== nums[k]) {
                total++;
                System.out.print("----> "+nums[k]+" ");
            }
        }
        if (total != 0) {
            System.out.println("恭喜你中了"+total+"注");
        }else {
            System.out.println("祝你下次时来运转");
        }
    }

    /**
     * 开奖
     * @param map
     * @param nums
     */
    public  static void print(HashMap<Integer,Integer> map,int[] nums){

        System.out.print("这是你猜的双色球");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(" "+nums[k]);

        }
        System.out.println();
        System.out.print("这是今日的双色球");
        for (Integer value : map.values()) {
            System.out.print(" "+value);
        }

    }
}
