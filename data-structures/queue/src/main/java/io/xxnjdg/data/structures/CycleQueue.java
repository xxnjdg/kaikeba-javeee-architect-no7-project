package io.xxnjdg.data.structures;

public class CycleQueue extends AbstractQueue {

    public CycleQueue(Integer maxCapacity) {
        this.maxCapacity = maxCapacity + 1;
        elementList = new int[this.maxCapacity];
    }

    @Override
    public Boolean isEmpty() {
        return front == back;
    }

    @Override
    public Boolean isFull() {
        return (back + 1) % maxCapacity == front;
    }

    @Override
    public Boolean doAddElement(int element) {
        elementList[back] = element;
        back = (back + 1) % maxCapacity;
        return true;
    }

    @Override
    public Integer doGetElement() {
        int element = elementList[front];
        elementList[front] = 0;
        front = (front + 1) % maxCapacity;
        return element;
    }
}