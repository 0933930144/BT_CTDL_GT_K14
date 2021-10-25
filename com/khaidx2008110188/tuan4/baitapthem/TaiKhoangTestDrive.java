package tuan4.baitapthem;

public class TaiKhoangTestDrive {
public static void main(String[] args) {
	TaiKhoang[] danhsachtk = new TaiKhoang[2];
	TaiKhoang TaiKhoang0 = new TaiKhoang(123456789, 99999999, "Duonng Xuan Khai");
	TaiKhoang TaiKhoang1 = new TaiKhoang(03102002, 00, "Pham Le Tuan Kiet");
	danhsachtk[0] = TaiKhoang0;
	danhsachtk[1] = TaiKhoang1;
	for (int i = 0; i < danhsachtk.length; i++) {
		danhsachtk[i].inThongTin();
	}
}
}
