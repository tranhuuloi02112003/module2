package bai3;

import java.util.Scanner;

public class themPTVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 5};
        int arr1[] = new int[arr.length + 1];
        int x, index;

        do {
            System.out.print("Nhập VT cần chèn:");
            index = sc.nextInt();
        } while (index <= 0 && index > arr1.length);
        System.out.print("Nhập GT cần chèn:");
        x = sc.nextInt();
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i >= index) {
                arr1[i] = arr[i - 1];
            } else if (i == index - 1) {
                arr1[i] = x;
            } else if (i < index - 1) {
                arr1[i] = arr[i];
            }
        }
        System.out.println("Sau khi chèn");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
