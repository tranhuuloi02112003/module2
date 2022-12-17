package bai3;

import java.util.Scanner;

public class TongCacSoODuongCheoMang2Chieu {
    public static void main(String[] args) {
        System.out.print("Nhập số cột và dòng của mảng 2 chiều:");
        Scanner scanner= new Scanner(System.in);
        int cotVaDong=scanner.nextInt();
        int a[][]= new int[cotVaDong][cotVaDong];
        int sum=0;
        for (int i = 0; i < cotVaDong; i++) {
            for (int j = 0; j < cotVaDong; j++) {
                System.out.print("a["+i+"]["+j+"]=");
                a[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < cotVaDong; i++) {
            for (int j = 0; j < cotVaDong; j++) {
                if (i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
