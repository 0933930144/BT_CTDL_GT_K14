package tuan3.baitapthem;

public class XeTestDrive {
public static void main(String[] args) {
	Xe xe;
	xe = new Xe();
	xe.dong = "Xe số";
	System.out.println("Dòng xe"+ xe.dong);
	System.out.println();
	
	xe = new Xe("Dương Xuân Khai", "Sirius","Xe Số","Giấy phép lái xe", 4.5);
	xe.inThongTin();
}
}
