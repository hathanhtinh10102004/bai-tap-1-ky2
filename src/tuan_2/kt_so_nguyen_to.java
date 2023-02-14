package tuan_2;

import javax.swing.text.Style;
import java.util.Scanner;

public class kt_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số :");
        int number = sc.nextInt();
        if (number<2){
            System.out.println(number + "không phải là số nguyên tố");
        } else{
            int i = 5;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0);{
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + "là số nguyên tố");
            } else
                System.out.println(number + "không phải là số nguyên tố");
        }
    }
}
