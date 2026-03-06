package com.example.OnTap_bai4;

public class StudentGrader {
    public String SinhVien(int diem){
        if(diem<0||diem>100){
            throw new IllegalArgumentException("Điểm không hợp lệ");
        }
        if(diem<=40) return "F";
        if(diem<=60) return "D";
        if(diem<=70) return "C";
        if(diem<=80) return "B";
        return "A";
    }
}
