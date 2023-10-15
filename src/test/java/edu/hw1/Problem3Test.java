package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void countDigits1() {
        Problem3 problem3 = new Problem3();
        int number=0;
        int response = problem3.countDigits(number);
        Assertions.assertThat(response).isEqualTo(1);
    }
    @Test
    void countDigits2() {
        Problem3 problem3 = new Problem3();
        int number=-300;
        int response = problem3.countDigits(number);
        Assertions.assertThat(response).isEqualTo(3);
    }

}
