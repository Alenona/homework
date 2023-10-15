package edu.hw1;

public class Problem3 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

}
