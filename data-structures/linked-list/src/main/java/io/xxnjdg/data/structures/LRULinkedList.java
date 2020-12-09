package io.xxnjdg.data.structures;

public class LRULinkedList {
    private int size;
    private int capacity;
    private Node head;
    private Node tail;

    public LRULinkedList() {
        this.capacity = 10;
    }

    public LRULinkedList(int size) {
        this.capacity = size;
    }

    public void addElement(String name,Object element){
        addElement(new Node(name, element));
    }

    private void addElement(Node node){

        if (size == 0){
            tail = node;
        }
        if (size == capacity){
            deleteLastElement();
        }
        Node next = head;
        if (next != null){
            next.setPrev(node);
        }
        head = node;
        node.setNext(next);
        size++;
    }

    private void deleteLastElement() {
        tail = tail.getPrev();
        tail.setNext(null);
        size--;
    }

    private void deleteElement(Node node) {
        Node prev = node.getPrev();
        Node next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
    }

    public Node findNode(String name){
        Node node = head;
        do {
            String name1 = node.getName();
            if (name.equals(name1)){
                break;
            }
            node = node.getNext();
        }while (node != null);

        return node;
    }

    public Object getElement(String name){
        if (name == null || head == null){
            return null;
        }
        Node node = findNode(name);
        if (node == null){
            return null;
        }else if (node == tail){
            deleteLastElement();
            addElement(node);
        }else if (node != head){
            deleteElement(node);
            addElement(node);
        }
        return node.getValue();
    }

    public void show(){
        Node node = head;
        if (node == null){
            System.out.println("空");
            return;
        }

        do {
            System.out.println(node.getValue());
            node = node.getNext();
        }while (node != null);
    }

    private static class Node {
        private String name;
        private Object value;
        private Node next;
        private Node prev;

        public Node() {
        }

        public Node(String name, Object value) {
            this.name = name;
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
