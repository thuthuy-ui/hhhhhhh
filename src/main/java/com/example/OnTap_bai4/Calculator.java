package com.example.OnTap_bai4;

public class Calculator {
    public double DiemTrungBinh(double toan, double ly , double hoa){
        if(toan<0||toan>10||ly<0||ly>10||hoa<0||hoa>10){
            throw new IllegalArgumentException("Điểm phải nằm trong khoảng từ 0 đến 10");
        }
        int count = 3;
        if (count == 0) throw new ArithmeticException("Chia cho 0");
        return (toan+ly+hoa)/count;
    }

}
