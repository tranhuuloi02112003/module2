package bai3;

import java.util.Scanner;

public class timGTMAXTrongMang2Chieu {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int m,n;
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        int a[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "]["+ j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }

        int max = a[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
        
    }

