package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void countK1() {
        Problem7 problem7 = new Problem7();
        int number=6174;
        int response= problem7.countK(number);
        Assertions.assertThat(response).isEqualTo(0);
    }
    @Test
    void countK2() {
        Problem7 problem7 = new Problem7();
        int number=6621;
        int response= problem7.countK(number);
        Assertions.assertThat(response).isEqualTo(5);
    }
}
