package tuan4.baitapthem;

public class MayTinh {
	String nhaSanXuat;
	int namSanXuat;
	String heDieuHanh;
	String Ram;
	String CPU;
	int gia;
	int namBaoHanh;
	
	public MayTinh() {}
	public MayTinh(int g, int namBH, int namSX) {
		gia = g;
		namSanXuat = namSX;
		namBaoHanh = namBH;
	}
	public MayTinh(int g, int namBH, int namSX, String nhaSX, String HDH, String R, String C) {
		gia = g;
		namSanXuat = namSX;
		namBaoHanh = namBH;
		nhaSanXuat = nhaSX;
		heDieuHanh = HDH;
		Ram = R;
		CPU = C;
	}
	void inThongTin() {
		System.out.println("Gia: "+ gia + "  " + "Nam Bao Hanh: "+ namBaoHanh + "  " + "Nam San Xuat: "+ namSanXuat + "  " + "Nha San Xuat: "+ nhaSanXuat + "  " + "He Dieu Hanh: "+ heDieuHanh + "  " + "Ram: "+ Ram + "  " + "CPU: "+ CPU);

}
}
