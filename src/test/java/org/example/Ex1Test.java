package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {
    @Test
    public void testDummyTel() {
        assertEquals(13.13, Ex1.DummyTel(18,50));
        assertEquals(15.62, Ex1.DummyTel(18,70));
        assertEquals(26.25, Ex1.DummyTel(8,50));
        assertEquals(31.24, Ex1.DummyTel(8,70));
        assertEquals(31.5, Ex1.DummyTel(8,60));
        assertEquals(15.75, Ex1.DummyTel(18,60));
        
    }
}