package bai3;

import java.util.Scanner;

public class DemSoKiTuXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "tran huu loi";
        int count = 0;
        System.out.print("Kí tự muốn đếm trong chuỗi:");
        char kiTu = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kiTu) {
                count++;
            }
        }
        System.out.println("Kí tự "+kiTu+" xuất hiện "+count+" trong chuỗi");
    }
}

