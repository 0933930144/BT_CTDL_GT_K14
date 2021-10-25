package com.khaidx2008110188.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class Applemain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <Apple> appleList = new ArrayList<Apple>();
        public static void main(String[] args) {
            while (true){
                System.out.println("------------------MENU-----------");
                System.out.println("|1. Nhap tao                    |");
                System.out.println("|2. Tim tao       	            |");
                System.out.println("|3. In danh sach tao            |");
                System.out.println("|4. thoat                    	|");
                System.out.println("---------------------------------");
                System.out.print("Chon chuc nang: ");
                int luaChon = sc.nextInt();
                switch(luaChon){
                    case 1:
                    them();
                    break;
                    case 2:
                    timTao(); 
                    break;
                    case 3:
                    inThongTin();
                    break;
                    default: System.out.println("kết thúc chương trình");
                    break;
                }}while(LuaChon >= 1 && LuaChon <= 3);
        }
               
    static void them(){
        sc.nextLine();
        while(true){
        Apple apple = new Apple();
        System.out.print("Nhap ma tao: ");
        apple.ma = sc.nextLine();
        System.out.print("Nhap khoi luong: ");
        apple.khoiLuong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap mau tao: ");
        apple.mauSac = sc.nextLine();
        appleList.add(apple);
        System.out.print("Nhap Them (y/n)?: ");
        if(sc.nextLine().equals("n"))
            break;
    }
}

static void timTao(){
    
    System.out.print("Nhap mau can tim: ");
    
    for (Apple apple : appleList) {
        if(sc.nextLine().equals(apple.mauSac))
            apple.inDanhSachTao();
        }
    }
    

static void inThongTin(){
    sc.nextLine();
    for (Apple apple : appleList) {
        apple.inDanhSachTao();
    }
}
}