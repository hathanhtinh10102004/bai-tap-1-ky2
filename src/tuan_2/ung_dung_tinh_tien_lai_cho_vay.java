package tuan_2;

import java.util.Scanner;

public class ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền đầu tư: ");
        money = input.nextDouble();
        System.out.println("nhập số tháng: ");
        month = input.nextInt();
        System.out.println("nhập lãi suất hàng năm theo phần trăm: ");
        interestRate = input.nextDouble();
        double totalInterset = 0;
        for (int i = 0; i < month ; i++){
            totalInterset += money * (interestRate/100)/12 * month;
        }
        System.out.println("total of interest: " + totalInterset);
    }
}
