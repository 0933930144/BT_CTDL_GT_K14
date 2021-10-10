package tuan4.Lap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lap4bai2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> DanhSach = new ArrayList<String>();
    public static void main(String[] args) {
        int luaChon;
        do{
            
            System.out.println("*-*-*-*-MENU-*-*-*-*");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. Xuat danh sach vua nhap.");
            System.out.println("3. Xuat danh sach ngau nhien.");
            System.out.println("4. Sap xep giam dan va xep danh sach.");
            System.out.println("5. Tim va xoa ho ten.");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();
            switch(luaChon){
                case 1: nhap(); 
                    break;
                case 2: xuat(); 
                    break;
                case 3: xuatNgauNhien(); 
                    break;
                case 4: sapXepVaXuatDS(); 
                    break;
                case 5: xoa(); 
                 break;
                case 6: 
                    break;
                default: System.out.println("Lua chon khong hop le");
            }
            System.out.print("Quai lai lua chon Yes=1/No=0: ");
            luaChon = sc.nextInt();
        } while(luaChon == 1);
    }
    static void nhap(){
        while(true){
            System.out.print("Nhap ho va ten: ");
            sc.nextLine();
            String hoTen = sc.nextLine();
            DanhSach.add(hoTen);
            System.out.print("ban co muon nhap them Yes=1/No=0: ");
            int a = sc.nextInt();
            if(a == 0)
                break; 
        }
    }
    static void xuat(){
        System.out.println("danh sach vua nhap:");
        for(String x : DanhSach){
            System.out.printf("Ho va ten: %s\n", x);
        }
    }
    static void xuatNgauNhien(){
        Collections.shuffle(DanhSach);
        xuat();
    }
    static void sapXepVaXuatDS(){
        Collections.sort(DanhSach);
        Collections.reverse(DanhSach);
        xuat();
    }
    static void xoa(){
        for(String x: DanhSach){
            System.out.println("Nhap ten can xoa: ");
            String hoTen = sc.nextLine();
            if(x == hoTen){
                DanhSach.remove(hoTen);
            }
        }
    }
}
