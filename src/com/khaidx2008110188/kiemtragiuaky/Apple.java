package com.khaidx2008110188.kiemtragiuaky;
public class Apple {
    String ma;
    double khoiLuong;
    String mauSac;

    Apple(){}

    
    Apple(String ID,double KL,String ms){
        ma = ID;
        khoiLuong = KL;
        mauSac = ms;
    }

    void inDanhSachTao(){
        System.out.println("ID Tao: "+ma);
        System.out.println("Khoi Luong: "+khoiLuong);
        System.out.println("Mau Sac: "+mauSac);
    }
}

