package me.zhiyong.aigo.examples.algo.sort;

/**
 * Created by afanty on 17-2-15.
 */
public abstract class AbstractSorter<T> implements Sorter<T> {
    protected void swap(Comparable<T>[] data, int i, int j) {
        Comparable<T> tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
