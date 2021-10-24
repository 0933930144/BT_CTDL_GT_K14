package tuan1;

import java.util.Scanner;

public class lap1bai2 {
public static void main(String[] args) {
        int dai, rong;
        int CV, DT;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
            rong = sc.nextInt();
        System.out.print("Nhap chieu dai: ");
            dai = sc.nextInt();
            CV = (dai + rong)*2;
            DT = dai*rong;
        System.out.printf("Chu vi : %d ", CV);
        System.out.println("\n-------------------------------");
        System.out.printf("Dien tich: %d \n", DT);
        System.out.println("\n-------------------------------");
        System.out.printf("Canh nho : %d", Math.min(dai, rong));
        
    }
    

}

