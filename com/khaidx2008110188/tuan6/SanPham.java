package com.khaidx2008110188.tuan6;
public class SanPham {
        String tenSP;
        double donGia;
        double giamGia;
        String thue;
        int sl;
        Scanner nhap = new Scanner(System.in);
        //HÀM TẠO SẢN PHẨM
        SanPham(){
            
        }
        //HÀM IN THÔNG TIN SẢN PHẨM
        void inThongtin(){
            System.out.println("Ten San Pham: "+tenSP);
            System.out.println("Don Gia: "+donGia);
            System.out.println("Giam Gia: "+giamGia);
            System.out.println("Thue: "+thue);
            System.out.println("---------------------");
        }
    
        void nhapThongTin(){
            System.out.println("Thong tin san pham:");
            System.out.print("Ten san pham: ");
            tenSP = nhap.nextLine();
            System.out.print("Don gia: ");
            donGia = nhap.nextDouble();
            System.out.print("Giam gia: ");
            giamGia = nhap.nextDouble();
            System.out.print("Thue: ");
            nhap.nextLine();
            thue = nhap.nextLine();
            System.out.println("----------------------");
        }
        
    }

