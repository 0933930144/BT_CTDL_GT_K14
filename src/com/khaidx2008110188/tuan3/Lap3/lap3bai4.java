package tuan3.Lap3;

import java.util.Scanner;

public class lap3bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("--Nhap so sinh vien--: ");
        int n = sc.nextInt();
        String hoTen[] = new String[n];
        double diem[] = new double[n];
        for(int i = 0;i < n;i++) {
            sc.nextLine();
            System.out.printf("Ho va ten sinh vien thu %d: ", i+1);
            hoTen[i] = sc.nextLine();
            System.out.println("-----------------------------");
            System.out.printf("Diem sinh vien thu %d: ", i+1);
            diem[i] = sc.nextDouble();
        }
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n - 1;j++){
                if(diem[i] > diem[j]){
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;
                    String tam2 = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tam2;
                }
            }
        }
        System.out.printf("DANH SÁCH SINH VIÊN");
        for(int i = 0;i < n;i++){
            System.out.printf("\nHo va ten: %s\n", hoTen[i]);
            System.out.printf("Diem: %.2f\n", diem[i]);
            if(diem[i] >= 9)
                System.out.println("Xep loai: Xuat xac");
            else{
                if(diem[i] >= 7.5)
                    System.out.println("Xep loai: gioi");
                else{
                    if(diem[i] >= 6.5)
                        System.out.println("Xep loai: kha");
                    else{
                        if(diem[i] >= 5)
                            System.out.println("Xep loai: trung binh");
                        else    
                            System.out.println("Xep loai: yeu");
                    }
                }
            }
        }
       
    }
}

