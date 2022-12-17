package bai3;

import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int []a=new int [3];
        int []b=new int[4];
        int []c= new int [a.length+b.length];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a["+i+"]=");
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("Nhập b["+i+"]=");
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j <a.length ; j++,i++) {
                c[j]=a[i];
            }
            for (int j = 0; j < b.length; j++,i++) {
                c[i]=b[j];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]+" ");
        }
    }
}
