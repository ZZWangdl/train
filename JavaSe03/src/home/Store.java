package home;

import java.util.*;

public class Store {
    private List<Goods> list;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Store)) return false;
        Store store = (Store) o;
        return Objects.equals(list, store.list);
    }

    public List<Goods> getList() {
        return list;
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    public Store(List<Goods> list) {
        this.list = list;
    }

    /**
     * 打印商店商品信息
     */
    public void print() {
        System.out.print("商品编号\t");
        System.out.print("商品名称\t");
        System.out.print("商品库存\t");
        System.out.print("价格\t");
        for (Goods goods : list) {
            System.out.println();
            System.out.print(goods.getId() + "\t");
            System.out.print("  " + goods.getName() + "\t");
            System.out.print("  " + goods.getCount() + "\t");
            System.out.print(goods.getPrice() + "\t");
        }
        System.out.println();
    }

    /**
     * 添加商品(id为主键)
     *
     * @param goods
     * @return
     */
    public boolean isadd(Goods goods) {
        for (Goods goods1 : list) {
            if (goods1.getId() == goods.getId()) {
                System.out.println("商品编号重复,添加失败");
                return false;
            }
        }
        System.out.println("添加成功");
        return list.add(goods);

    }

    /**
     * 删除指定编号的商品
     *
     * @param id
     */
    public void delete(int id) {
        Scanner scanner = new Scanner(System.in);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Goods goods1 = (Goods) it.next();
            if (goods1.getId() == id) {
                System.out.println("商品信息" + goods1);
                System.out.print("确定删除吗?(Y/N)\n");
                String flag = scanner.next();
                if ("Y".equals(flag)) {
                    System.out.println("删除成功");
                    it.remove();
                    print();
                    return;
                }
            }
        }
        System.out.println("没有该商品,请重新输入");

    }

    /**
     * 根据价格降序排列
     */
    public void sortPrinceDown() {
        list.sort(new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
    }

    /**
     * 根据编号升序
     */
    public void sortIdUp() {
        list.sort(new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    /**
     * 根据id查找商品是否存在
     * @param id
     * @return
     */
    public  boolean   issearch (int id){
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Goods goods1 = (Goods) it.next();
            if (goods1.getId() == id) {
                System.out.println("商品信息" + goods1);
                return true;
            }
        }
        return false;
    }


    public void total(int id,int counts){
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Goods goods1 = (Goods) it.next();
            if (goods1.getId() == id) {
                int surplus = goods1.getCount()-counts;
                if ( surplus>=0) {
                    goods1.setCount(surplus);
                    System.out.println("您购买的商品总价格为:"+ goods1.getCount()* goods1.getPrice());
                }else {
                    System.out.println("不好意思,您买的东西太畅销了,库存不够.当前还有"+goods1.getCount()+"个");
                }
            }
            }

    }
}
