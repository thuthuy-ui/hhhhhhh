package com.example.OnTap_bai4;

import java.util.ArrayList;
import java.util.List;

public class SachService {

    private List<Sach> list = new ArrayList<>();

    public void validat(Sach sach){
        if(sach.getTen()==null||sach.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("Tên sách không được để trống");
        }
        if(sach.getSoTrang()<1||sach.getSoTrang()>50){
            throw new IllegalArgumentException("Trang sách pahir nằm trong khoảng từ 1-50");
        }
    }
    public String addSach(Sach sach){
        validat(sach);
        list.add(sach);
        return "thêm thành công";
    }
    public String UpdateSach(String idSach, Sach sachnew){
        for (Sach sach:list){
            if(sach.getId().equals(idSach)){
                validat(sachnew);
                sach.setTen(sachnew.getTen());
                sach.setSoTrang(sachnew.getSoTrang());
                sach.setTenTacGia(sachnew.getTenTacGia());
                sach.setLanTaiBan(sachnew.getLanTaiBan());
                return "Sửa thành công";
            }
        }
        throw new IllegalArgumentException("Không tìm thấy ID sách");
    }
}
