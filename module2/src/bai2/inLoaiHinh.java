package bai2;

import java.util.Scanner;

public class inLoaiHinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1/Print the rectangle");
            System.out.println("2/Print the square triangle " +
                    "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3/Print isosceles triangle");
            System.out.println("4/Exit");
            System.out.print("Mời chọn chức năng");
            chon=sc.nextInt();
            switch (chon){
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
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
                    break;
                case 3:

                    break;
            }
        }while (chon!=4);
        
        

    }
}
