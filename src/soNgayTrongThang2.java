
//  Sử dụng if else:

import java.util.Scanner;

public class soNgayTrongThang2 {

    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng: ");
        month = scanner.nextInt();

        // các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Tháng " + month + " có 31 ngày.");
        }
        // các tháng 4, 6, 9 và 11 có 30 ngày
        else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
            System.out.println("Tháng " + month + " có 30 ngày.");
        }

        // Riêng tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
        else if (month == 2) {
            int year;
            System.out.println("Mời bạn nhập năm: ");
            year = scanner.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
            } else {
                System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
            }
        }

        else{
            System.out.println("Nhập tháng không hợp lệ.");
        }

    }
}

