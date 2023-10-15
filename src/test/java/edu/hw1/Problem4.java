package edu.hw1;

public class Problem4 {
    public static boolean isNestable(int[] a1, int[] a2) {
        int min1 = Min(a1);
        int min2 = Min(a2);

        int max1 = Max(a1);
        int max2 = Max(a2);

        return min1 > min2 && max1 < max2;
    }

    private static int Min(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int Max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
