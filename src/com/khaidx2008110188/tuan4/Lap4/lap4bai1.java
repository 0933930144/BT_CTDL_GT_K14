package tuan4.Lap4;

import java.util.ArrayList;
import java.util.Scanner;

public class lap4bai1 {
    public static void main(String[] args) {
        double b;
        String a;
        double tong = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true){
            System.out.printf("Nhap so thuc %d: ", list.size());
            b = sc.nextDouble();
            list.add(b);
            sc.nextLine();
            System.out.println("May co nhap them khong(Y/N): ");
            a = sc.nextLine();
            if(a.equals("N"))
                 break;
        }
        System.out.println("Cac so thuc");
        for(Double x : list){
            System.out.printf("+ %.2f\n", x);
            tong += x;
        }
        System.out.println("Tong cac so thuc la: Tong = " + tong);
        
    }

    
}

