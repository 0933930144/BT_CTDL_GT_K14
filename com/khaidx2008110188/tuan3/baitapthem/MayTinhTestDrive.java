package tuan3.baitapthem;

public class MayTinhTestDrive {
public static void main(String[] args) {
	MayTinh mayTinh;
	mayTinh = new MayTinh();
	mayTinh.nhaSanXuat = "MSI";
	System.out.println("Nhà Sản Xuất"+ mayTinh.nhaSanXuat);
	System.out.println();
	mayTinh = new MayTinh("MSI",2020, "Window 10 ", "8GB","Intel core I7", 23000000,2);
	mayTinh.inThongTin();
}
}
