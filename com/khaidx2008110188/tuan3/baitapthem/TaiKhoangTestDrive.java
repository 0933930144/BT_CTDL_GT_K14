package tuan3.baitapthem;

public class TaiKhoangTestDrive {
public static void main(String[] args) {
	TaiKhoang taiKhoang;
	taiKhoang = new TaiKhoang();
	taiKhoang.tenChuTaiKhoang = "Dương Xuân Khai";
	System.out.println("Tên Chủ Tài Khoảng"+ taiKhoang.tenChuTaiKhoang);
	System.out.println();
	taiKhoang = new TaiKhoang("Dương Xuân Khai", 999999, 123456789);
	taiKhoang.inThongTin();
}
}
