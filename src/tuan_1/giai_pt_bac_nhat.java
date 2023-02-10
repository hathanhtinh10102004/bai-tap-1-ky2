package tuan_1;

import java.util.Scanner;
public class giai_pt_bac_nhat {
    public static void main(String[] args) {
        System.out.println("...");
        System.out.println("giai pt bac nhat 'a * x + b = c':");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("x =" + answer);
        } else {
            if (b == c) {
                System.out.print("luôn đúng");
            } else {
                System.out.print("vô lý!!");
            }
        }
    }
}
