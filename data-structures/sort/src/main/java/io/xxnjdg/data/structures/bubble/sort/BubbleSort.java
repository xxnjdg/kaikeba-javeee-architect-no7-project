package io.xxnjdg.data.structures.bubble.sort;

public class BubbleSort {

    public static void sort(int[] a) {

        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1 + i; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {3, 9, -1, 10, -2};
        sort(list);
    }

}
