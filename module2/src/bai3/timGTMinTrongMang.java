package bai3;

import java.util.Scanner;

public class timGTMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập SL PT trong mảng: ");
        int n=scanner.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a["+i+"]=");
            a[i]=scanner.nextInt();
        }
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("GTNN trong mảng là:"+min);
    }
}
