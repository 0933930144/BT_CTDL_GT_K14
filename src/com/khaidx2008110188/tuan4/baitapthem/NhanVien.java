package tuan4.baitapthem;

public class NhanVien {
	String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
    public NhanVien(){}
    public NhanVien(int l) {
    	luong = l; 
   }
    public NhanVien(int l, String TNV, String DC, String BPLV, String NS){
    	luong = l;
    	diaChi = DC;
    	tenNhanVien = TNV;
    	boPhanLamViec = BPLV;
    	ngaySinh = NS;
    }
    void inThongTin() {
    	System.out.println("Luong: "+ luong + "  " + "Ten Nhan Vien: "+ tenNhanVien + "  " + "Dia Chi: "+ diaChi + "  " + "Bo Phan Lam Viec: "+ boPhanLamViec + "  " + "Ngay Sinh: "+ ngaySinh);
}
}