package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void isPalindromeDescendant1() {
        Problem6 problem6 = new Problem6();
        int number=12345;
        boolean response= problem6.isPalindromeDescendant(number);
        Assertions.assertThat(response).isEqualTo(false);
    }
    @Test
    void isPalindromeDescendant2() {
        Problem6 problem6 = new Problem6();
        int number=11211230;
        boolean response= problem6.isPalindromeDescendant(number);
        Assertions.assertThat(response).isEqualTo(true);
    }
    @Test
    void isPalindromeDescendant3() {
        Problem6 problem6 = new Problem6();
        int number=11;
        boolean response= problem6.isPalindromeDescendant(number);
        Assertions.assertThat(response).isEqualTo(true);
    }
}
