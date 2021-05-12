import java.util.Scanner;

public class canhTamgiac {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a = scan.nextInt();
        System.out.println("Nhap b= ");
        b = scan.nextInt();
        System.out.println("Nhap c= ");
        c = scan.nextInt();

        if((a<b+c) && (b<a+c) && (c<b+a)) {
            System.out.println("\n * Đây là ba cạnh của tam giác *");
        }
        else{
            System.out.println("\n * Đây không phải là ba cạnh của tam giác *");
        }
    }
}
