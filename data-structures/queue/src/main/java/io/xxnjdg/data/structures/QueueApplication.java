package io.xxnjdg.data.structures;

import java.util.ArrayList;

public class QueueApplication {
    public static void main(String[] args) {

        ArrayList<AbstractQueue> list = new ArrayList<>();
        list.add(new Queue(4));
        list.add(new CycleQueue(4));

        for (AbstractQueue queue : list) {
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println(queue.getElement());

            System.out.println(queue.addElement(1));
            System.out.println(queue.addElement(2));
            System.out.println(queue.addElement(3));
            System.out.println(queue.addElement(4));
            System.out.println(queue.addElement(5));
            System.out.println(queue.addElement(6));


            queue.showQueue();

            System.out.println(queue.getElement());
            System.out.println(queue.getElement());
            System.out.println(queue.getElement());
            System.out.println(queue.getElement());
            System.out.println(queue.getElement());
            System.out.println(queue.getElement());

            queue.showQueue();

            System.out.println(queue.addElement(7));
            System.out.println(queue.addElement(8));

            queue.showQueue();
            System.out.println("++++++++++++++++++++++++++++++++++");
        }
    }
}
