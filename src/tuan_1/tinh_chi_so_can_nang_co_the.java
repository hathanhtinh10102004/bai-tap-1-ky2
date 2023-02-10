package tuan_1;

import java.util.Scanner;

public class tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("can nang cua ban:");
        weight = sc.nextDouble();
        System.out.println("chieu cao cua ban");
        height = sc.nextDouble();

        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "dien tich\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "thieu can");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "binh thuong");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "thua can");
        else
            System.out.printf("%-20.2f%s", bmi, "beo phi");
    }
}
