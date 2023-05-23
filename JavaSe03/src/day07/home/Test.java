package day07.home;

import java.util.*;
/**
 * 模拟斗地主的洗牌 摸牌 看牌
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> farmer1 = new HashMap<>();
        HashMap<Integer, String> farmer2 = new HashMap<>();
        HashMap<Integer, String> landlord = new HashMap<>();
        HashMap<Integer, String> map = new HashMap<>();
        creatPolker(map);
        shuffle(map);
        licensing(map, farmer1, farmer2, landlord);
        //  show(farmer1,farmer2,landlord);
        sortAll(farmer1, farmer2, landlord);

    }

    private static void valuesall(HashMap<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        List<Pokers> list1 = new ArrayList<>();
        for (String s : list) {
            Pokers p = new Pokers();
            p.name = s;
            p.ass();
            list1.add(p);
        }
        list1.sort(new Comparator<Pokers>() {
            @Override
            public int compare(Pokers o1, Pokers o2) {
                return o1.value - o2.value;
            }
        });
        System.out.print("整理后为:");
        for (Pokers pokers : list1) {
            System.out.print(" " + pokers.name);
        }
        System.out.println();
    }

    private static void sortAll(HashMap<Integer, String> farmer1, HashMap<Integer, String> farmer2, HashMap<Integer, String> landlord) {
        System.out.print("农民1的牌");
        valuesall(farmer1);
        System.out.print("农民2的牌");
        valuesall(farmer2);
        System.out.print("地主的牌");
        valuesall(landlord);

    }

    /**
     * 观看三者的手牌
     *
     * @param farmer1
     * @param farmer2
     * @param landlord
     */
    private static void show(HashMap<Integer, String> farmer1, HashMap<Integer, String> farmer2, HashMap<Integer, String> landlord) {
        System.out.print("农民1的牌为:");
        for (Map.Entry<Integer, String> entry : farmer1.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.print("\n农民2的牌为:");
        for (Map.Entry<Integer, String> entry : farmer2.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }

        System.out.print("\n地主的牌为:");
        for (Map.Entry<Integer, String> entry : landlord.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }

    /**
     * 发牌
     *
     * @param map
     * @param farmer1
     * @param farmer2
     * @param landlord
     */
    private static void licensing(HashMap<Integer, String> map, HashMap<Integer, String> farmer1, HashMap<Integer, String> farmer2, HashMap<Integer, String> landlord) {
        for (int i = 1; i < map.size() / 3; i++) {
            farmer1.put(i, map.get(17 * 0 + i));
            farmer2.put(i, map.get(17 * 1 + i));
            landlord.put(i, map.get(17 * 2 + i));
        }
        landlord.put(18, map.get(52));
        landlord.put(19, map.get(53));
        landlord.put(20, map.get(54));
        /*for (int i = 1; i <=map.size(); i+=3) {
            farmer1.put(i, map.get(i));//1 4 7 10   i-2*temp
            farmer2.put(i+1, map.get(i+1));//2 5 8 11 i+1-(2*temp+1)
            landlord.put(i+2, map.get(2+ i));// 3 6 9 12 i+2-2*(temp+1)

        }*/
    }

    /**
     * 模拟洗牌
     *
     * @param map
     */
    private static void shuffle(HashMap<Integer, String> map) {
        String temp = null;
        for (int i = 1; i < map.size() + 1; i++) {
            int k = (int) (Math.random() * 54 + 1);
            temp = map.get(k);
            map.put(k, map.get(i));
            map.put(i, temp);
        }
        // System.out.println(map);
    }

    /**
     * 模拟创建一副扑克牌
     *
     * @param map
     */
    private static void creatPolker(HashMap<Integer, String> map) {
        for (int i = 0; i < 4; i++) {
            String type = "";
            if (i == 1) {
                type = "♣";
            } else if (i == 2) {
                type = "♦";
            } else if (i == 3) {
                type = "♥";
            } else if (i == 0) {
                type = "♠";
            }
            for (int j = 1; j < 14; j++) {
                if (j == 1) {
                    map.put(i * 13 + j, type + "10");
                    continue;
                } else if (j % 10 == 0) {
                    map.put(i * 13 + j, type + "J");
                    continue;
                } else if (j % 12 == 0) {
                    map.put(i * 13 + j, type + "Q");
                    continue;
                } else if (j % 13 == 0) {
                    map.put(i * 13 + j, type + "K");
                    continue;
                } else if (j % 11 == 0) {
                    map.put(i * 13 + j, type + "A");
                    continue;
                }
                map.put(i * 13 + j, type + j);
            }
        }
        map.put(53, "小王");
        map.put(54, "大王");
    }


}
