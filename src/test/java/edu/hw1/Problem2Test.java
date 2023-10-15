package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void minutesToSeconds1() {
        Problem2 problem2 = new Problem2();
        String time="10:60";
        int response = problem2.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(-1);
    }

    @Test
    void minutesToSeconds2() {
        Problem2 problem2 = new Problem2();
        String time="01:00";
        int response = problem2.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(60);
    }

    @Test
    void minutesToSeconds3() {
        Problem2 problem2 = new Problem2();
        String time="13:56";
        int response = problem2.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(836);
    }
    @Test
    void minutesToSeconds4() {
        Problem2 problem2 = new Problem2();
        String time="10";
        int response = problem2.minutesToSeconds(time);
        Assertions.assertThat(response).isEqualTo(-1);
    }
}
