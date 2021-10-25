package tuan2;

import java.util.Scanner;

public class lap2bai4 {
public static void main(String[] args) {
	        int d;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("*********MENU*********");
	        System.out.println(">>1: Giai pt bac 1.");
	        System.out.println(">>2: Giai pt bac 2.");
	        System.out.println(">>3: Tinh tien dien.");
	        System.out.print("Nhap su lua chon(1>>3): " );
	        d = sc.nextInt();
	        switch(d) {
	            case 1: giaiPTBac1(); break;
	            case 2: giaiPTBac2(); break;
	            case 3: tinhTienDien(); break;
	            default: System.out.println("Lựa chọn không hợp lệ!!!");
	        }
	       
	   }

	    static void giaiPTBac1() {
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
	    static void giaiPTBac2() {
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
	    static void tinhTienDien(){
	        int soDien, tienDien;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("So dien su dung trong thang : ");
	        soDien = sc.nextInt();
	        if(soDien < 50){
	            tienDien = soDien*1000;
	            System.out.printf("So tien dien  %d", tienDien);
	        }
	        else{
	            tienDien = 50*1000 + (soDien - 50)*1200;
	            System.out.printf("So tien dien %d", tienDien);
	        }
	     
	            
	    }
	}

