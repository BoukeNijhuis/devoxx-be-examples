package org.example.primenumber;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberGeneratorTest {

    @Test
    public void underFifty() {

        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        assertEquals(expected, primeNumberGenerator.generate(50));
    }
}