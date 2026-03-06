package com.example.OnTap_bai4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachTest {

    private SachService sachService;

    @BeforeEach
    void setUp(){
        sachService = new SachService();
    }
    @Test
    void testAddSachSoTrangMin() {
        Sach s = new Sach("1", "Toán", 1, "TG A", 1);
        assertEquals("thêm thành công", sachService.addSach(s));
    }
    @Test
    void testAddSachSoTrang15() {
        Sach s = new Sach("4", "Toán", 15, "TG A", 1);
        assertEquals("thêm thành công", sachService.addSach(s));
    }
    @Test
    void testAddSachSoTrangMax(){
        Sach sach = new Sach("2","Ly",50,"Huy",2);
        assertEquals("thêm thành công", sachService.addSach(sach));
    }
    @Test
    void testAddSachSoTrangla0(){
        Sach sach = new Sach("3","Ly",0,"Huy",2);
        assertThrows(IllegalArgumentException.class,()->sachService.addSach(sach));
    }
    @Test
    void testAddSachSoTrangla51(){
        Sach sach = new Sach("5","Ly",51,"Huy",2);
        assertThrows(IllegalArgumentException.class,()->sachService.addSach(sach));
    }
    @Test
    void testAddSachDeTrongTen(){
        Sach sach = new Sach("6","",5,"Huy",2);
        assertThrows(IllegalArgumentException.class,()->sachService.addSach(sach));
    }
    @Test
    void testUpdateSachTen(){
        sachService.addSach(new Sach("1","Toán",1,"TG A",1));
        Sach sachNew = new Sach("1","hhh",1,"TG B",1);
        assertEquals("Sửa thành công", sachService.UpdateSach("1", sachNew));
    }
    @Test
    void testUpdateSachTenNull(){
        sachService.addSach(new Sach("1","Toán",1,"TG A",1));
        Sach sachNew = new Sach("1",null,1,"TG B",1);
        assertThrows(IllegalArgumentException.class,()->sachService.UpdateSach("1",sachNew));
    }

}