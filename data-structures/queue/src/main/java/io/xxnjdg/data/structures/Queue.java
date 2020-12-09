package io.xxnjdg.data.structures;

public class Queue extends AbstractQueue {

    public Queue(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        elementList = new int[maxCapacity];
    }

    @Override
    public Boolean isEmpty() {
        return front == back;
    }

    @Override
    public Boolean isFull() {
        return back == maxCapacity;
    }

    @Override
    public Boolean doAddElement(int element) {
        elementList[back++] = element;
        return true;
    }

    @Override
    public Integer doGetElement() {
        return elementList[front++];
    }
}
