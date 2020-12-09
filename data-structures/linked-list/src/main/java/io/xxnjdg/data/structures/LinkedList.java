package io.xxnjdg.data.structures;

public class LinkedList {
    private final Node headNode;
    private Node tailNode;
    private int nodeSize;

    public LinkedList() {
        headNode = new Node();
        tailNode = headNode;
    }

    public void addLastNode(String value) {
        Node node = new Node(value);
        node.setNext(null);
        tailNode.setNext(node);
        tailNode = node;
        nodeSize++;
    }

    public void addFrontNode(String value) {
        //链表还没有节点
        if (headNode == tailNode) {
            addLastNode(value);
        } else {
            //链表有节点
            Node next = headNode.getNext();
            Node node = new Node(value);
            headNode.setNext(node);
            node.setNext(next);
            nodeSize++;
        }
    }

    public void addIndexNode(int index, String value) {
        int indexValue = nodeIndex(index);
        if (indexValue == 0) {
            addFrontNode(value);
        } else if (indexValue == nodeSize) {
            addLastNode(value);
        } else {
            Node preNode = headNode.getNext();
            for (int i = 1; i < indexValue; i++) {
                preNode = preNode.getNext();
            }
            Node next = preNode.getNext();
            Node node = new Node(value);
            preNode.setNext(node);
            node.setNext(next);
            nodeSize++;
        }
    }

    private int nodeIndex(int size) {
        if (size < 0) {
            return 0;
        }

        return Math.min(size, nodeSize);

    }

    public int getNodeSize() {
        return nodeSize;
    }

    public void showElement() {
        for (Node next = headNode.getNext(); next != null; next = next.getNext()) {
            System.out.println(next.getValue());
        }
    }

    private static class Node {
        private String value;
        private Node next;

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
    }
}
