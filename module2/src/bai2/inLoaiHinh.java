package bai2;

import java.util.Scanner;

public class inLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1/Print the rectangle");
            System.out.println("2/Print the square triangle " +
                    "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3/Print isosceles triangle");
            System.out.println("4/Exit");
            System.out.print("Mời chọn chức năng:");
            chon=sc.nextInt();
            switch (chon){
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    tamGiacVuong();
                    break;
                case 3:
                    tamGiacCan();
                    break;
            }
        }while (chon!=4);

    }
    public static void hinhChuNhat(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   public static void tamGiacCan(){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=3- i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tamGiacVuong(){
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
