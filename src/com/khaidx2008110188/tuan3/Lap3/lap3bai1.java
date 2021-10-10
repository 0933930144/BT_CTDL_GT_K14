package tuan3.Lap3;

import java.util.Scanner;

public class lap3bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int n = sc.nextInt();
        boolean cs = true;
        for(int i = 2;i < n - 1;i++){
            if(n % i == 0){
                cs = false;
                break;
            }
        }
        if(cs == true)
            System.out.println(n + " la so nguyen to !");
        else System.out.println(n + " khong phai so nguyen to  !");    
    }
    
}
