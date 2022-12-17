package bai3;

import java.util.Scanner;

public class TongCacSoOCotXacDinh {
    public static void main(String[] args) {
        int cotMuonTinh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột và dòng của mảng 2 chiều:");
        int cotVaDong = scanner.nextInt();
        int a[][] = new int[cotVaDong][cotVaDong];
        for (int i = 0; i < cotVaDong; i++) {
            for (int j = 0; j < cotVaDong; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = scanner.nextInt();
            }
        }
        do {
            System.out.print("Nhập cột muốn tính tổng:");
            cotMuonTinh = scanner.nextInt();
        } while (cotMuonTinh > cotVaDong);

        int sumCacCot = 0;
        for (int i = 0; i < cotVaDong; i++) {
            for (int j = 0; j < cotVaDong; j++) {
                if (j == cotMuonTinh) {
                    sumCacCot += a[i][j];
                }
            }
        }
        System.out.println(sumCacCot);
    }
}
