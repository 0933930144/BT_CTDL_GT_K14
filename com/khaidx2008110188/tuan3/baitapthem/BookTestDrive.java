package tuan3.baitapthem;

public class BookTestDrive {
	 public static void main(String[] args) {
		 Book book;
		 book = new Book();
		 book.nhaXuatBan = "Bùi Xuân Huấn";
		 System.out.println("Nhà xuất bản: " +book.nhaXuatBan);
		        
		 System.out.println();

		 book = new Book("Bùi Xuân Huấn", 2021, 100, "Tiểu Thuyết", 85.5, 95.5);
		 book.inThongTin();

		    }
		    
		}