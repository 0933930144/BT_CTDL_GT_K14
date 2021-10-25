package tuan3.baitapthem;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = ("Dương Xuân Khai");
        System.out.println("Tên nhân viên: "+nhanVien.tenNhanVien);

        System.out.println();

        nhanVien = new NhanVien("Dương Xuân Khai", 20000000, "Ninh Thuận", "Quản lý", "27/11/2002");
        nhanVien.inThongTin();

    }
    
}

