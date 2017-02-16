package me.zhiyong.aigo.examples.algo.sort;

import java.util.Arrays;

/**
 * Created by afanty on 17-2-15.
 */
public class HeapSort<T> extends AbstractSorter<T> {
    public void sort(Comparable<T>[] data) {
        buildHeap(data);
        heapSort(data, data.length);
    }

    private void buildHeap(Comparable<T>[] data) {
        for (int i = (data.length - 1) >> 1; i >= 0; i--) {
            heapify(data, i, data.length);
        }
    }

    private void heapify(Comparable<T>[] data, int i, int length) {
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (left < length && data[left].compareTo((T) data[largest]) > 0) {
            largest = left;
        }
        if (right < length && data[right].compareTo((T) data[largest]) > 0) {
            largest = right;
        }
        if (largest != i) {
            swap(data, i, largest);
            heapify(data, largest, length);
        }
    }

    private void heapSort(Comparable<T>[] data, int length) {
        for (int i = data.length - 1; i >= 0; i--) {
            swap(data, i, 0);
            heapify(data, 0, --length);
        }
    }

    public static void main(String[] args) {
        Sorter<Integer> s1 = new HeapSort<Integer>();
        Integer[] data = new Integer[]{3, 5, 1, 4, 2};
        s1.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
