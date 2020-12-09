package io.xxnjdg.data.structures;

/**
 * 1) 单链表反转
 * 2) 链表中环的检测
 * 3) 两个有序的链表合并
 * 4) 删除链表倒数第n个结点
 * 5) 求链表的中间结点
 * <p>
 * Author:
 */
public class MyLinkedListAlgo {

    //哨兵节点，不存任何数据
    private final Node head;

    public MyLinkedListAlgo() {
        head = new Node(0, null);
    }

    public void add(int value) {
        Node node = new Node(value, null);
        node.setNext(head.getNext());
        head.setNext(node);
    }

    public void show() {
        show(head);
    }

    public void show(Node head) {
        showNode(listIsEmpty(head));
    }

    public static void showNode(Node node) {
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    private Node listIsEmpty(Node head) {
        Node node = head.getNext();
        if (node == null) {
            System.out.println("队列为空");
        }
        return node;
    }

    //1) 单链表反转
    public void reverse() {
        reverse(listIsEmpty(head));
    }

    private void reverse(Node node) {
        Node current = new Node(0, null);
        while (node != null) {
            Node next = node.getNext();
            node.setNext(current.getNext());
            current.setNext(node);
            node = next;
        }
        show(current);
    }

    public Node getList() {
        return head.getNext();
    }

    //3) 两个有序的链表合并
    public static Node mergeTwoLists(Node l1, Node l2) {
        Node soldier = new Node(0, null); //利用哨兵结点简化实现难度 技巧三
        Node p = soldier;

        while (l1 != null && l2 != null) {
            if (l1.getData() < l2.getData()) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        return soldier.next;
    }

    public static Node merge(Node list1, Node list2) {
        if (list1 == null || list2 == null) {
            return null;
        }

        Node mergeList = new Node(0, null);
        Node current = mergeList;

        while (list1 != null && list2 != null) {
            if (list1.getData() < list2.getData()) {
                current.setNext(list1);
                list1 = list1.getNext();
            }else{
                current.setNext(list2);
                list2 = list2.getNext();
            }

            current = current.getNext();
        }

        if (list1 != null){
            current.setNext(list1);
        }

        if (list2 != null){
            current.setNext(list2);
        }

        return mergeList.getNext();
    }

    //int[] a1 = {12,8,7,5,1};
    public static Node findMiddleNode(Node list) {
        if (list == null) return null;

        Node fast = list;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }


    public static void main(String[] args) {
        MyLinkedListAlgo list = new MyLinkedListAlgo();
        int[] a1 = {12,8,7,5,1};
//        int[] a1 = {20, 18, 17, 15, 14};
        for (int j : a1) {
            list.add(j);
        }

        MyLinkedListAlgo list1 = new MyLinkedListAlgo();
        int[] a2 = {13, 10, 6, 4, 3};
        for (int j : a2) {
            list1.add(j);
        }

//        Node node = mergeTwoLists(list.getList(), list1.getList());
//        showNode(node);

        System.out.println("-------");
        Node merge = merge(list.getList(), list1.getList());
        showNode(merge);

    }
}
