package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void isNestable1() {
        Problem4 problem4 = new Problem4();
        int [] a1={2, 4};
        int [] a2={0, 1, 6};
        boolean response = problem4.isNestable(a1, a2);
        Assertions.assertThat(response).isEqualTo(true);
    }
    @Test
    void isNestable2() {
        Problem4 problem4 = new Problem4();
        int [] a1={2, 4};
        int [] a2={4, 6};
        boolean response = problem4.isNestable(a1, a2);
        Assertions.assertThat(response).isEqualTo(false);
    }
}
