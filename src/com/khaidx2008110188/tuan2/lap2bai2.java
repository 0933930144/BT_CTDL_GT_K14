package tuan2;

import java.util.Scanner;
public class lap2bai2 {
public static void main(String[] args) {
		// giai pt bac 2: ax^2 + b + c = 0
		// cac bien: a, b, c, x1, x2, delta
		/*
		 * B1. delta = b^2 - 4ac
		 * B2. kiem tra delta
		 * 2.1. delta <0 => pt vo nghiem
		 * 2.2. delta == 0 => pt co nghiem kep x1=x2=-2b/2a
		 * 2.3. delta >0 => pt co vo so nghiem
		 * x1 = (-b-sprt(delta))/(2a)
		 * x2 = (-b+sprt(delta))/(2a)
		 */
		double a, b, c, x1, x2, delta;
		System.out.println("Nhap vao a:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.println("Nhap vao b:");
		b = sc.nextDouble();
		System.out.println("Nhap vao c:");
		c = sc.nextDouble();
		delta = Math.pow(b, 2)-4*a*c;
		if(a==0) {
			System.out.println("Nhap du lieu sai");
		}else {
		if(delta<0) {
			// truong hop delta <0
			System.out.println("Vo nghiem");
		}else if(delta==0) {
			// truong hop delta = 0
			x1 = -b/(2*a);
			System.out.println("Pt co nghiem kep x1=x2:"+ x1);
		}else {
			// truong hop delta >0
			x1 = (-b-Math.sqrt(delta))/(2*a);
			x2 = (-b+Math.sqrt(delta))/(2*a);
			System.out.println("Pt co nghiem");
			System.out.println("x1:"+ x1);
			System.out.println("x2:"+ x2);
		}
	}
	}
	}

