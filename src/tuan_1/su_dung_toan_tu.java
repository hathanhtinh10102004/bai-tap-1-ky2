package tuan_1;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu rong:");
        width = sc.nextFloat();
        System.out.println("nhap chieu cao:");
        height = sc.nextFloat();
        Float area = width * height;
        System.out.println("dien tich hinh chu nhat la:"+ area);
    }
}
