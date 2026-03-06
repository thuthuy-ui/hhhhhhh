package com.example.OnTap_bai4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGraderTest {
    StudentGrader studentGrader = new StudentGrader();

    @Test
    void TestDiemSinhVienF(){
        assertEquals("F",studentGrader.SinhVien(20));
    }
    @Test
    void TestDiemSinhVienD(){
        assertEquals("D",studentGrader.SinhVien(55));
    }
    @Test
    void TestDiemSinhVienB(){
        assertEquals("C",studentGrader.SinhVien(65));
    }
    @Test
    void TestDiemSinhVienC(){
        assertEquals("B",studentGrader.SinhVien(75));
    }
    @Test
    void TestDiemSinhVienFA(){
        assertEquals("A",studentGrader.SinhVien(85));
    }
    @Test
    void TestDiemSinhVienKhongHopLe(){
        assertThrows(IllegalArgumentException.class,()->studentGrader.SinhVien(-5));
    }
    @Test
    void TestDiemSinhVien1KhongHopLe(){
        assertThrows(IllegalArgumentException.class,()->studentGrader.SinhVien(115));
    }


}