package org.example.ktnc_01;

public class ArrayUtils {
    public static int sum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Mảng không được null");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
