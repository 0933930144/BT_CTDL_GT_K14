package tuan3.Lap3;

import java.util.Arrays;
import java.util.Scanner;

public class lap3bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            System.out.printf("A[%d]= ", i);
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0;i < n;i++){
            System.out.println();
            System.out.printf("A[%d]= %d", i,a[i]);    
        }
        int Min = a[0];
        for(int x : a){
            Math.min(Min, x);
        }
        System.out.println("\nPhan tu nho nhat mang la: \n" + Min);
        int tong = 0;
        int dem = 0;
        for(int x : a){
            if(x % 3 == 0){
                tong += x;
                dem++;
            }      
        }
        System.out.printf("\nTrung binh cong cac so chia het cho 3: %d", tong/dem);
          
    }  
    
}