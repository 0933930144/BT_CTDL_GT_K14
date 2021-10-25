package tuan4.baitapthem;

public class TaiKhoang {
	String tenChuTaiKhoang;
	double soTaiKhoang;
	double soDuTrongTaiKhoang;
	public TaiKhoang(){}
	public TaiKhoang(double STK, double SDTK) {
		soTaiKhoang = STK;
		soDuTrongTaiKhoang = SDTK;
	}
	public TaiKhoang(double STK, double SDTK, String TCTK) {
	soTaiKhoang = STK;
	soDuTrongTaiKhoang = SDTK;
	tenChuTaiKhoang = TCTK;
}
	void inThongTin() {
		System.out.println("So Tai Khoang: "+ soTaiKhoang+ "  " +"So du"+ soDuTrongTaiKhoang+ "  "+"Ten Chu Tai Khoang: "+tenChuTaiKhoang);
	}
}