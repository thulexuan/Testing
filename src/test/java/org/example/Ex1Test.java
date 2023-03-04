package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {
    @Test
    public void testDummyTel1() {
        /*
        Kiểm thử dùng phương pháp phân lớp tương đương mạnh
        0 <= startTime <= 23, 0 <= totalTime <= Integer.MAX_INT
        Chia startTime thành các lớp [Integer.MIN_INT, -1], [0,7], [8,17], [18,23], [24, Integer.MAX_INT]
        Chia totalTime thành các lớp [Integer.MIN_INT, -1], [0,60], [61,Integer.MAX_INT]
        */
        assertEquals(-1, Ex1.DummyTel(-2,-2));
        assertEquals(-1, Ex1.DummyTel(-2,1));
        assertEquals(-1, Ex1.DummyTel(-2,61));
        assertEquals(-1, Ex1.DummyTel(4,-2));
        assertEquals(13.13, Ex1.DummyTel(4,50));
        assertEquals(17.85, Ex1.DummyTel(4,80));
        assertEquals(-1, Ex1.DummyTel(10,-2));
        assertEquals(26.25, Ex1.DummyTel(10,50));
        assertEquals(35.7, Ex1.DummyTel(10,80));
        assertEquals(-1, Ex1.DummyTel(20,-2));
        assertEquals(13.13, Ex1.DummyTel(20,50));
        assertEquals(17.85, Ex1.DummyTel(20,80));
        assertEquals(-1, Ex1.DummyTel(25,-2));
        assertEquals(-1, Ex1.DummyTel(25,50));
        assertEquals(-1, Ex1.DummyTel(25,80));
    }
    @Test
    public void testDummyTel2() {
        // Kiểm thử dùng phương pháp phân tích giá trị biên yếu
        // 0 <= startTime <= 23, 0 <= totalTime <= Integer.MAX_INT
        // startTime: nom = 10, min = 0, min+ = 1, max = 23, max-=22
        // totalTime: nom = 50, min = 0, min+ = 1, max = Integer.MAX_INT, max- = Integer.MAX_INT - 1
        assertEquals(26.25, Ex1.DummyTel(10,50));
        assertEquals(0, Ex1.DummyTel(10,0));
        assertEquals(0.53, Ex1.DummyTel(10,1));
        assertEquals(9.5831457747E8, Ex1.DummyTel(10,Integer.MAX_VALUE));
        assertEquals(9.5831457703E8, Ex1.DummyTel(10,Integer.MAX_VALUE - 1));
        assertEquals(13.13, Ex1.DummyTel(0,50));
        assertEquals(13.13, Ex1.DummyTel(1,50));
        assertEquals(13.13, Ex1.DummyTel(22,50));
        assertEquals(13.13, Ex1.DummyTel(23,50));
    }


}