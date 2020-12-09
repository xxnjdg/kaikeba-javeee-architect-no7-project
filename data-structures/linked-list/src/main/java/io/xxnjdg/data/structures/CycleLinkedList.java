package io.xxnjdg.data.structures;

public class CycleLinkedList {
    private Node head;
    private Node tail;

    public CycleLinkedList() {
        head = new Node();
        tail = head;
    }

    public void addLastNode(String value) {
        Node node = new Node(value);

        if (head.getNext() == null) {
            head.setNext(node);
            tail = node;
        }

        node.setPrev(tail);
        tail.setNext(node);
        tail = node;
        Node next = head.getNext();
        next.setPrev(tail);
        node.setNext(next);
    }

    public void deleteNode(int index){
        if (head.getNext() == null){
            System.out.println("链表已空");
            return;
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        Node prev = node.getPrev();
        Node next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);

        if (head.getNext() == node){
            head.setNext(null);
        }else{
            head.setNext(next);
        }
        System.out.println(node.getValue());
    }

    public void showElement() {
        Node next = head.getNext();
        if (next == null) {
            System.out.println("队列为空");
            return;
        }

        System.out.println(next.getValue() + " next " + next.getNext() + " prev " + next.getPrev() + " current" + next);
        for (Node node = next.getNext(); node != next; node = node.getNext()) {
            System.out.println(node.getValue() + " next " + node.getNext() + " prev " + node.getPrev() + " current" + node);
        }

    }

    private static class Node {
        private String value;
        private Node next;
        private Node prev;


        public Node() {
        }

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }


    }
}
