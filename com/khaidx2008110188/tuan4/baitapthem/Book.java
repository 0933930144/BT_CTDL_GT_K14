package tuan4.baitapthem;

public class Book {
	int gia;
	int giaBan;
	int namXuatBan;
	int soLuong;
	String nhaXuatBan;
	String loai;
	
	public Book() {}
	public Book(int g, int gb, int namXB, int sl ) {
		gia = g;
		giaBan = gb;
		namXuatBan = namXB;
		soLuong = sl;
}
	public Book(int g, int gb, int namXB, int sl, String nhaXB, String l) {
		gia = g;
		giaBan = gb;
		namXuatBan = namXB;
		soLuong = sl;
		nhaXuatBan = nhaXB;
		loai = l;
}
	void inThongTin() {
		System.out.println("Gia: "+ gia + "  " + "Gia Ban: "+ giaBan + "  " + "Nam Xuat Ban: "+ namXuatBan + "  " + "So Luong: "+ soLuong + "  " + "Nha Xuat Ban: "+ nhaXuatBan + "  " + "Loai: "+ loai);
}	
}
