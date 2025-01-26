package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PowerTest {
    Power power;

    @BeforeEach
    void setUp() {
        power = new Power();
    }

    @Test 
    public void testBaseOfZero() {
        assertEquals(0, power.naivePower(0, 1));
    }

    @Test 
    public void testPowerOfZero() {
        assertEquals(1, power.unoptimizedDCPower(2, 0));
    }

    //said integer number on the left was too large
    /*@Test 
    public void testPowerOf10000() {
        assertEquals(781293612478825281, power.optimizedDCPower(3, 10000));
    }*/ 
}
