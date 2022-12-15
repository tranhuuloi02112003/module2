package bai3;

import java.util.Scanner;

public class xoaPTKhoiMang {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 7, 5, 2,2};
        int n = a.length;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập pt cần xóa:");
        int x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                count++;
            }
        }
        int itemp = 0;
        int[] temp = new int[n - count];
        for (int i = 0; i < a.length; i++) {
            if (x != a[i]) {
                temp[itemp] = a[i];
                itemp++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + " ");
        }

    }
}
