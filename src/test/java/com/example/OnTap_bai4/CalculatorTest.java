package com.example.OnTap_bai4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testDiemtrongvunghople(){
        assertEquals(8.0,calculator.DiemTrungBinh(7,8,9));
    }
    @Test
    void testDiemvungKhonghople(){
        assertThrows(IllegalArgumentException.class,()->calculator.DiemTrungBinh(-4,-5,-5));
    }
    @Test
    void testDiemkhongvunghople(){
        assertThrows(IllegalArgumentException.class,()->calculator.DiemTrungBinh(15,15,15));
    }
    @Test
    void testDiemtaibientren(){
        assertEquals(0.0,calculator.DiemTrungBinh(0,0,0));
    }
    @Test
    void testDiemtạibienduoi(){
        assertEquals(10.0,calculator.DiemTrungBinh(10,10,10));
    }

}