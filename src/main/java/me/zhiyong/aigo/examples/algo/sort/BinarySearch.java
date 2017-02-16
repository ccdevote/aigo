package me.zhiyong.aigo.examples.algo.sort;

import java.util.Arrays;

/**
 * Created by afanty on 17-2-16.
 */
public class BinarySearch {

    public int search(int[] data, int k, int begin, int end) {
        int low = begin;
        int high = end - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (k > data[middle]) {
                low = middle + 1;
            } else if (k < data[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;// not findd
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(data));
        BinarySearch search = new BinarySearch();
        int i = search.search(data, 5, 0, data.length);
        System.out.println(i);
    }
}
