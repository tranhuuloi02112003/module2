package bai1;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        final int rate=23000;
        System.out.print("Nhập USD");
        double USD=sc.nextDouble();
        System.out.println("VND:"+USD*rate);
    }
}
