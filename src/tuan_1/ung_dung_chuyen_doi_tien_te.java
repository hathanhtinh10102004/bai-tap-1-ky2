package tuan_1;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so tien usd :");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("gia tri vnd: " + quydoi);
    }
}
