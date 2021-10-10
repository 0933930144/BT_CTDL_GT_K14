package tuan4.Lap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class lap4bai3 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<SP> List = new ArrayList<SP>();
    public static void main(String[] args) {
    
    int luaChon;
    do{
        System.out.println("---------------------Menu----------------------");
        System.out.println("| 1.Nhap ten san pham:                        |");                     
        System.out.println("| 2.Danh sach san pham:                       |");
        System.out.println("| 3.Sap xep san pham giam dan theo gia:       |");
        System.out.println("| 4.Tim va xoa san pham:                      |");
        System.out.println("| 5.Gia trung binh cua san pham:              |");
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
        SP sanpham = new SP();
        System.out.println("Nhap ten san pham: ");
        sanpham.tenSanPham = sc.nextLine();
        System.out.println("Nhap gia san pham: ");
        sanpham.giaSanPham = sc.nextDouble();
        List.add(sanpham);
        sc.nextLine();
        System.out.println("Ban co muon nhap tiep Y=1/N=0 ");
        if(sc.nextLine().equals("0"))
        break;

    }
    
}
static void xuat(){
    System.out.println("Danh sach vua nhap:");
    for (SP x : List) {
        System.out.println("Ten San Pham:"+ x.tenSanPham);
        System.out.println("Gia San Pham:"+ x.giaSanPham);
    }
}
static void sapXep(){
    Comparator<SP> comp = new Comparator<SP>() {
        @Override
        public int compare(SP o1, SP o2) {
            return Double.compare(o1.giaSanPham, o2.giaSanPham);
        }
    };
    Collections.sort(List, comp);
    Collections.reverse(List);
    xuat();   
}
static void xoa(){
    System.out.print("Nhap ten can xoa: ");
    String name = sc.nextLine();
    for (SP a : List) {
        if((a.tenSanPham).equals(name)){
            List.remove(a);
            System.out.println("Da xoa!");
            break;
        }
    }    
}
static void tinhTrungBinh(){
    double tong = 0;
    double trungBinh = 0;
    for (SP x : List) {
        tong += x.giaSanPham;
    }
    trungBinh = tong/List.size();
    System.out.println("Gia trung binh cua cac san pham la: "+trungBinh);
}
}


