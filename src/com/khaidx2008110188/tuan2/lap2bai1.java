package tuan2;

import java.util.Scanner;

public class lap2bai1 {
public static void main(String[] args) {
	
	double a, b, x;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap a:");
	a = sc.nextDouble();
	System.out.println("Nhap b:");
	b = sc.nextDouble();
		
	if(a == 0) {
			// truong hop a = 0
		if(b == 0) {
			// truong hop a = 0, b = 0
			System.out.println("Vo so nghiem");
		}else {
			System.out.println("Vo nghiem");
		}
		}else {
			// truong hop a != 0
			x = -b/a;
			System.out.println("Co nghiem x:"+ x);
		}
	}
}
