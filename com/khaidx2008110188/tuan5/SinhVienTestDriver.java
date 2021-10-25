package com.khaidx2008110188.tuan5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDriver {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVien> list = new ArrayList<SinhVien>();
    public static void main(String[] args) {
    
    int luaChon;
    do{
        System.out.println("---------------------Menu----------------------");
        System.out.println("| 1.Nhap thong tin sinh vien:                 |");                     
        System.out.println("| 2.Danh sach sinh vien:                      |");
        System.out.println("| 3.Sap xep sinh vien:                        |");
        System.out.println("| 4.Tim sinh vien:                            |");
        System.out.println("| 5.Tim va sua sinh vien:                     |");
        System.out.println("| 6.Tim va xoa sinh vien:                     |");
        System.out.println("| 7.Diem trung binh cua sinh vien:            |");
        System.out.println("| Nhap lua chon:                              |");
        System.out.println("-----------------------------------------------");
        luaChon = sc.nextInt();
        sc.nextLine();
        switch(luaChon){
            case 1:
                nhap();               
                break;
            case 2:
                xuat();
                break;
            case 3:          
                sapXep();
                break;
            case 4:
                tim();
            case 5:
                sua();
            case 6:           
                xoa();
                break;
            case 7:   
                tinhTrungBinh();
                break;
            default:System.out.println("Lua chon khong phu hop");
                break;
        }
        System.out.println("Tro lai lua chon Y=1/N=0");
        luaChon = sc.nextInt();                  
    } while(luaChon == 1);
}
static void nhap(){
    while(true){
        SinhVien SV = new SinhVien();
        System.out.println("Nhap ten sinh vien: ");
        SV.hoVaTen = sc.nextLine();
        System.out.println("Nhap diem sinh vien: ");
        SV.diemTrungBinh = sc.nextDouble();
        list.add(SV);
        sc.nextLine();
        System.out.println("Ban co muon nhap tiep Y=1/N=0 ");
        if(sc.nextLine().equals("0"))
        break;

    }
    
}
static void xuat(){
    System.out.println("Danh sach vua nhap:");
    for (SinhVien x : list) {
        System.out.println("Ten sinh vien:"+ x.hoVaTen);
        System.out.println("Diem sinh vien:"+ x.diemTrungBinh);
    }
}
static void sapXep(){
    Comparator<SinhVien> comp = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien o1, SinhVien o2) {
            return Double.compare(o1.diemTrungBinh, o2.diemTrungBinh);
        }
    };
    Collections.sort(list, comp);
    Collections.reverse(list);
    xuat();   
}
static void tim() {
    for (SinhVien x : list) {
        System.out.print("Nhap ten sinh vien can tim: ");
        if (sc.nextLine().equals(x.hoVaTen))
        System.out.println("Ho va ten sinh vien : " + x.hoVaTen);
        System.out.println("Diem trung binh : " + x.diemTrungBinh);
    }
}
static void sua() {
    for (SinhVien x : list) {
        System.out.print("Nhap ten can sua: ");
        if (sc.nextLine().equals(x.hoVaTen)) {
            System.out.print("Nhap diem moi: ");
            x.diemTrungBinh = sc.nextDouble();
            sc.nextLine();
        }
    }
}
static void xoa() {
    for (SinhVien x : list) {
        System.out.print("Nhap ten can xoa: ");
        if (sc.nextLine().equals(x.hoVaTen))
            list.remove(x);
    }
}    

static void tinhTrungBinh(){
    double tong = 0;
    double trungBinh = 0;
    for (SinhVien x : list) {
        tong += x.diemTrungBinh;
    }
    trungBinh = tong/list.size();
    System.out.println("Diem trung binh cua sinh vien la: "+trungBinh);
}
}