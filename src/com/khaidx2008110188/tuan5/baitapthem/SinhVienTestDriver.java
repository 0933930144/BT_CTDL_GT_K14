package tuan5.baitapthem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVienTestDriver {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVien> List = new ArrayList<SinhVien>();
    public static void main(String[] args) {
    
    int luaChon;
    do{
        System.out.println("---------------------Menu----------------------");
        System.out.println("| 1.Nhap thong tin sinh vien:                 |");                     
        System.out.println("| 2.Danh sach sinh vien:                      |");
        System.out.println("| 3.Sap xep sinh vien:                        |");
        System.out.println("| 4.Tim va xoa sinh vien:                     |");
        System.out.println("| 5.Diem trung binh cua sinh vien:            |");
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
                xoa();
                break;
            case 5:   
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
        List.add(SV);
        sc.nextLine();
        System.out.println("Ban co muon nhap tiep Y=1/N=0 ");
        if(sc.nextLine().equals("0"))
        break;

    }
    
}
static void xuat(){
    System.out.println("Danh sach vua nhap:");
    for (SinhVien x : List) {
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
    Collections.sort(List, comp);
    Collections.reverse(List);
    xuat();   
}
static void xoa(){
    System.out.print("Nhap ten can xoa: ");
    String name = sc.nextLine();
    for (SinhVien a : List) {
        if((a.hoVaTen).equals(name)){
            List.remove(a);
            System.out.println("Da xoa!");
            break;
        }
    }    
}
static void tinhTrungBinh(){
    double tong = 0;
    double trungBinh = 0;
    for (SinhVien x : List) {
        tong += x.diemTrungBinh;
    }
    trungBinh = tong/List.size();
    System.out.println("Diem trung binh cua sinh vien la: "+trungBinh);
}
}