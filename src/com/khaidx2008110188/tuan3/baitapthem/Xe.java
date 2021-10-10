package tuan3.baitapthem;

public class Xe {
	String tenChuXe;
	String hangSanXuat;
	String dong;
	String giayPhep;
	double dungTichXang;
	
	Xe(){
}
	Xe(String ten, String hang, String d, String GP, double DTX){
	tenChuXe = ten;
	hangSanXuat = hang;
	dong = d;
	giayPhep = GP;
	dungTichXang = DTX;
}
	void inThongTin() {
		System.out.println("Tên Chủ Xe:"+ tenChuXe);
		System.out.println("Hãng Sản Xuất:"+ hangSanXuat);
		System.out.println("Dong Xe:"+ dong);
		System.out.println("Giấy Phép:"+ giayPhep);
		System.out.println("Dung Tích Xăng: %.2f lít"+ dungTichXang);
		
}
}


