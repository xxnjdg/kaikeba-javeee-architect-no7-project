package io.xxnjdg.data.structures;

public abstract class AbstractQueue {
    protected int maxCapacity;
    protected int front;
    protected int back;
    protected int[] elementList;

    public abstract Boolean isEmpty();

    public abstract Boolean isFull();

    public abstract Boolean doAddElement(int element);

    public abstract Integer doGetElement();

    public Boolean addElement(int element) {
        return !isFull() && doAddElement(element);
    }

    public Integer getElement() {
        return isEmpty() ? null : doGetElement();
    }

    public void showQueue() {
        for (int i : this.elementList) {
            System.out.println(i);
        }
    }
}
