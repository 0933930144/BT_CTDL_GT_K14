package tuan3.baitapthem;

public class MayTinh {
	String nhaSanXuat;
	int namSanXuat;
	String heDieuHanh;
	String Ram;
	String CPU;
	double gia;
	int namBaoHanh;

	MayTinh(){		
}
	MayTinh(String NhaSX, int NamSX, String HDH, String R, String C, double g, int NamBH){
		nhaSanXuat = NhaSX;
		namSanXuat = NamSX;
		heDieuHanh = HDH;
		Ram = R;
		CPU = C;
		gia = g;
		namBaoHanh = NamBH;
		
}
	void inThongTin() {
		System.out.println("Nhà Sản Xuất:"+ nhaSanXuat);
		System.out.println("Năm Sản Xuất:"+ namSanXuat);
		System.out.println("Hệ Điều Hành:"+ heDieuHanh);
		System.out.println("Ram:"+ Ram);
		System.out.println("CPU:"+ CPU);
		System.out.println("Giá:"+ gia + "đồng");
		System.out.println("Năm Bảo Hành:"+ namBaoHanh);
	}
}
