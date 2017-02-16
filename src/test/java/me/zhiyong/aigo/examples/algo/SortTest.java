package me.zhiyong.aigo.examples.algo;

import java.util.Random;

/**
 * Created by afanty on 17-2-16.
 */
public class SortTest {
    private final int seed = 17;
    private Random random = new Random();

    public Integer[] generateData(int count) {
        Integer[] result = new Integer[count];
        for (int i = 0; i < count; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }


}
