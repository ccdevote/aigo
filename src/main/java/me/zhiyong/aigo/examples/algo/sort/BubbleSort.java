package me.zhiyong.aigo.examples.algo.sort;

import java.util.Arrays;

public class BubbleSort<T> extends AbstractSorter<T> {

    public void sort(Comparable<T>[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[i].compareTo((T) data[j]) > 0) {
                    swap(data, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sorter<Integer> s1 = new BubbleSort<Integer>();
        Integer[] data = new Integer[]{3, 5, 1, 4, 2};
        s1.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
