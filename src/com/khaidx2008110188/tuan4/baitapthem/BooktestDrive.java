package tuan4.baitapthem;

public class BooktestDrive {
public static void main(String[] args) {
	Book[] danhsachBook = new Book[3];
	Book Book0 = new Book(1500, 2000, 2002, 15, "To Hoai", "Truyen Tranh");
	Book Book1 = new Book(3000, 4500, 1987, 30, "Tran Dang Khoa", "Tho");
	Book Book2 = new Book(68000, 128000, 2002, 80, "Bui Xuan Huan", "Chien luoc marketing");
	
	danhsachBook[0] = Book0;
	danhsachBook[1] = Book1;
	danhsachBook[2] = Book2;
	
	for (int i = 0; i < danhsachBook.length; i++) {
		danhsachBook[i].inThongTin();
	}
}
}
