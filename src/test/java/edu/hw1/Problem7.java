package edu.hw1;
import java.util.Arrays;


public class Problem7 {
    public static int countK(int number) {
    if (number == 6174) {
        return 0;
    }

    int[] digits = getDigits(number);

    int ascending = getAscendingNumber(digits);
    int descending = getDescendingNumber(digits);

    int difference = descending - ascending;

    return 1 + countK(difference);
}

    public static int[] getDigits(int number) {
        int[] digits = new int[4];

        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int getAscendingNumber(int[] digits) {
        Arrays.sort(digits);

        int ascending = 0;

        for (int i = 0; i < digits.length; i++) {
            ascending = ascending * 10 + digits[i];
        }

        return ascending;
    }

    public static int getDescendingNumber(int[] digits) {
        Arrays.sort(digits);

        int descending = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            descending = descending * 10 + digits[i];
        }

        return descending;
    }
}
