package tuan3.baitapthem;

public class TaiKhoang {
	String tenChuTaiKhoang;
	int soTaiKhoang;
	int soDuTrongTaiKhoang;
	TaiKhoang(){	
}
	TaiKhoang(String CTK, int STK, int SDTK){
		tenChuTaiKhoang = CTK;
		soTaiKhoang = STK;
		soDuTrongTaiKhoang = SDTK;
}
	void inThongTin(){
		System.out.println("Tên Chủ Tài Khoảng:"+ tenChuTaiKhoang);
		System.out.println("Sô Tài Khoảng:"+ soTaiKhoang);
		System.out.println("Số Dư Trong Tài Khoảng:"+ soDuTrongTaiKhoang);
	}
}
