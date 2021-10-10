package tuan4.baitapthem;

public class MayTinhTestDrive {
public static void main(String[] args) {
	MayTinh[] danhsachmt = new MayTinh[2];
	MayTinh MayTinh0 = new MayTinh(23000000, 1, 2019, "MSI", "Window 10", "8GB", "Core i7");
	MayTinh MayTinh1 = new MayTinh(42000000, 1, 2021, "MSI", "Window 10", "32GB", "Core i9");
	
	danhsachmt[0] = MayTinh0;
	danhsachmt[1] = MayTinh1;

	for (int i = 0; i < danhsachmt.length; i++) {
		danhsachmt[i].inThongTin();
	}
}
}
