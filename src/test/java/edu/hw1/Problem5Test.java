package edu.hw1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void fixString() {
        Problem5 problem5 = new Problem5();
        String string="hTsii  s aimex dpus rtni.g";
        String response = problem5.fixString(string);
        Assertions.assertThat(response).isEqualTo("This is a mixed up string.");
    }
}
