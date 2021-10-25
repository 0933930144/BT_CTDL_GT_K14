package baitap;
public class SanPham {
    String tenSanPham;
	double donGia;
	double giamGia;
	float thueNhapKhau;

    SanPham(){
    }
	public SanPham(String tenSanPham, double donGia, double giamGia, float thueNhapKhau) {
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
		this.thueNhapKhau = thueNhapKhau;
	}
    void inThongTin(){
        System.out.println("Ten Sp:"+ tenSanPham);
        System.out.println("Gia:"+ donGia);
        System.out.println("Giam Gia:"+ giamGia);
        System.out.println("Thue:"+ thueNhapKhau);
    }
}


