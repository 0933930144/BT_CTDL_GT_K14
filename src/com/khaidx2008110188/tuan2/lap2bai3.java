package tuan2;

import java.util.Scanner;

public class lap2bai3 {
public static void main(String[] args) {
	int soDien, tienDien;
	Scanner sc = new Scanner(System.in);
	System.out.println("So dien su dung trong thang qua:");
	soDien = sc.nextInt();
	if (soDien < 50) {
		tienDien = soDien * 1000;
		System.out.println("So tien dien :"+ tienDien);
		
	}
	else {
		tienDien = 50*1000 + (soDien - 50)*1200;
		System.out.println("So tien dien :"+ tienDien);
		
		
	}
}
}
