package me.zhiyong.aigo.examples.algo.sort;

import java.util.Arrays;

public class QuickSort<T> extends AbstractSorter<T> {
    public void sort(Comparable<T>[] data) {
        if (data.length <= 1) {
            return;
        }
        qsort(data, 0, data.length - 1);
    }

    private void qsort(Comparable<T>[] data, int p, int r) {
        if (p < r) {
            int q = partition(data, p, r);
            qsort(data, p, q - 1);
            qsort(data, q + 1, r);
        }
    }

    private int partition(Comparable<T>[] data, int p, int r) {
        int q = p - 1;
        for (int i = p; i < r; i++) {
            if (data[i].compareTo((T) data[r]) < 0) {
                q++;
                swap(data, q, i);
            }
        }
        q++;
        swap(data, q, r);
        return q;
    }

    public static void main(String[] args) {
        Sorter<Integer> sorter = new QuickSort<Integer>();
        Integer[] data = new Integer[]{4, 5, 1, 3, 2};
        sorter.sort(data);
        System.out.println(Arrays.toString(data));

        Sorter<Character> s2 = new QuickSort<Character>();
        Character[] c = new Character[]{'b', 'c', 'a', 'd', 'e'};
        s2.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
