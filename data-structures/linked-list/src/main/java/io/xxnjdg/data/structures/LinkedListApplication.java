package io.xxnjdg.data.structures;

public class LinkedListApplication {
    public static void main(String[] args) {

//        LinkedList linkedList = new LinkedList();
//        linkedList.addFrontNode("1");
//        linkedList.addFrontNode("2");
//        linkedList.addFrontNode("3");
//        linkedList.addFrontNode("4");
//        linkedList.addFrontNode("5");
//        linkedList.addLastNode("最后");
//        linkedList.addIndexNode(2,"第二");
//        linkedList.addIndexNode(3,"第三");
//        linkedList.addIndexNode(-1,"第一");
//        linkedList.addIndexNode(100,"最最后");
//
//
//        linkedList.showElement();
//
//        System.out.println(linkedList.getNodeSize());

//        CycleLinkedList list = new CycleLinkedList();
//        list.addLastNode("1");
//        list.addLastNode("2");
//        list.addLastNode("3");
//        list.addLastNode("4");
//        list.addLastNode("5");
//
//        list.showElement();
//
//        list.deleteNode(2);
//        list.deleteNode(2);
//        list.deleteNode(2);
//        list.deleteNode(2);
//        list.deleteNode(2);
//        list.deleteNode(2);

        LRULinkedList list = new LRULinkedList();
        list.addElement("1","1");
        list.addElement("2","2");
        list.addElement("3","3");
        list.addElement("4","4");
        list.addElement("5","5");
        list.addElement("6","6");
        list.addElement("7","7");
        list.addElement("8","8");
        list.addElement("9","9");
        list.addElement("10","10");
        list.addElement("11","11");
        list.addElement("12","12");
        list.addElement("13","13");
        list.show();
        System.out.println("=++==============================");

        System.out.println(list.getElement("4"));


        list.addElement("22",22);
        list.getElement("2");
        list.getElement("5");
        list.getElement("7");
        list.getElement("11");

        list.show();






    }
}
