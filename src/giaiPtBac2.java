import java.util.Scanner;

import static java.lang.Math.sqrt;

class giaiptbac2 {
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, delta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a = scan.nextInt();
        if ( a==0 ){
            System.out.println("Biến a phải khác 0");
        }
        else{
            System.out.println("Nhap b= ");
            b = scan.nextInt();
            System.out.println("Nhap c= ");
            c = scan.nextInt();
            delta = (b*b - (4*a*c))/(2*a);
            if (delta<0) {
                System.out.println("Phương trình vô nghiệm");
            } else if(delta==0) {
                x1=x2= (-b/(2*a));
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
            }
            else {
                x1 = (float) ((-b + sqrt(delta))/(2*a));
                x2 = (float) ((-b - sqrt(delta))/(2*a));
                System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + x1 + " và x2 = " + x2);
            }
        }

    }
}
