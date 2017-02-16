package me.zhiyong.aigo.examples.algo.sort;

import java.util.Arrays;

public class InsertionSort<T> extends AbstractSorter<T> {

    public void sort(Comparable<T>[] data) {
        for (int i = 1; i < data.length; i++) {
            Comparable<T> k = data[i];
            int j = i - 1;
            for (; j >= 0 && data[j].compareTo((T) k) > 0; j--) {
                swap(data, j, j + 1);
            }
            data[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        Sorter<Integer> s1 = new InsertionSort<Integer>();
        Integer[] data = new Integer[]{3, 5, 1, 4, 2};
        s1.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
