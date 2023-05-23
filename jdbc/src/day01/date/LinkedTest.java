package day01.date;

import java.awt.*;

public class LinkedTest {
  private Node head;
  private Node end;
  private int size;
  private Node temp;
    public static void main(String[] args) {
        Node node = new Node();
        int date = 123;

        LinkedTest link = new LinkedTest();
        link.addnode(1, 1);
        link.addnode(2, 3);
        link.addnode(3, 45);
       link.addnode(2, 55);
        // link.addnode(5, 55);
        link.printall();
        link.removeIndex(4);
    }

    //打印所有节点
    private void printall() {
        System.out.println("一共有" + size + "个节点");
        temp = head;
        while (temp.next != null) {
            System.out.print(temp + "----->");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    //增加节点 根据下标 或者头结点插入,尾节点插入
    private void addnode(int index, int date) {
        Node node = new Node(date);
        if (size == 0) {
            head = node;
            end = node;
        } else {
            if (index-1 == size) {
                end.next = node;
                node.last = end;
                end = node;
            } else {
                temp = seacheIndex(index);
                if (temp == null) {
                    //  System.out.println("插入失败,没有该节点");
                    return;
                }
                //System.out.println(temp.last.date);
                 // System.out.println(temp.next.date);
                temp.last.next = node;
                node.last = temp.last;
                temp.last = node;
                node.next = temp;


            }
        }
        size++;
    }

    //查找下标为index 的节点
    public Node seacheIndex(int index) {
        if (index > size || index <= 0) {
            System.out.println("没有该节点,请输入有效的下标1~" + size + "之间的数字");
            return null;
        }
        temp = head;
        int i = 0;
        while (temp.next != null&&i<index-1) {
            temp = temp.next;
            i++;
        }
        //System.out.println(temp.date);
        return temp;
    }

    //删除指定第index的节点
    private void removeIndex(int index) {
        if (index ==1 ) {
            head = head.next;
            head.last.next = null;
            head.last = null;
        }else if (index == size) {
            end = end.last;
            end.next.last = null;
            end.next = null;
        }else {
        temp = seacheIndex(index);
        if (temp == null) {
            System.out.println("没有该节点,无需删除");
            return;
        }
        temp.last.next= temp.next;
        temp.next.last= temp.last;
        temp.next = null;
        temp.last = null;
        //  System.out.println(n2.last.date);
//        System.out.println(n2.next.date);
        }
        size--;
        System.out.println("删除成功");
        printall();
    }

}
