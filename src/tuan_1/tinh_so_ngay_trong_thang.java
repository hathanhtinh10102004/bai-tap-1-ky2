package tuan_1;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ngay thang:");
        int month = sc.nextInt();
        String dayaInmonth;
        switch (month){
            case 2:
                dayaInmonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayaInmonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayaInmonth = "30";
                break;
            default:
                dayaInmonth = " ";

        }
        if (dayaInmonth != "")
            System.out.printf("the month '%d' has %s days! " , month, dayaInmonth );
        else
            System.out.print("Invalid input!");
    }
}
