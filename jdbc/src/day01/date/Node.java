package day01.date;

import java.util.Objects;

public class Node {
    Node last ;
    int date;

    public Node(int date) {
        this.date = date;
    }

    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "date=" + date +
                '}';
    }

    public Node() {
    }

    public Node(Node last, int date, Node next) {
        this.last = last;
        this.date = date;
        this.next = next;
    }
}
