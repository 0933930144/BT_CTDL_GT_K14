package tuan4.baitapthem;

public class NhanVienTestDrive {
	public static void main(String[] args) {
		NhanVien[] danhsachnv = new NhanVien[3];
		NhanVien NhanVien0 = new NhanVien(20000000, "Duong Xuan Khai", "Ninh Thuan", "Quan Ly", "27/11/2002");
		NhanVien NhanVien1 = new NhanVien(15000000, "Trinh Tran Trung", "Ninh Thuan", "Ke Toan", "15/05/2002");
		NhanVien NhanVien2 = new NhanVien(12000000, "Pham Le Tuan Kiet", "Dong Nai", "Ke Toan", "03/10/2002");
		danhsachnv[0] = NhanVien0;
		danhsachnv[1] = NhanVien1;
		danhsachnv[2] = NhanVien2;
		for (int i = 0; i < danhsachnv.length; i++) {
			danhsachnv[i].inThongTin();
		}
	}
}
