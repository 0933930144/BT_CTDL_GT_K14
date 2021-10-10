package tuan3.Lap3;

public class lap3bai2 {
    public static void main(String[] args) {
        System.out.println("Bang cuu chuong:");
        for(int i = 1;i <= 10;i++){
            for(int j = 1;j <= 9;j++){
                System.out.printf("|%2d x %d =%2d  ",i ,j ,i*j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
