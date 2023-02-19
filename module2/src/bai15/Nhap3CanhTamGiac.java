package bai15;

import bai1.SoThanhChu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Nhap3CanhTamGiac {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       try {
           System.out.print("Nhập cạnh thứ 1 của tam giác:");
           int side1=Integer.parseInt(scanner.nextLine());
           System.out.print("Nhập cạnh thứ 2 của tam giác:");
           int side2=Integer.parseInt(scanner.nextLine());
           System.out.print("Nhập cạnh thứ 3 của tam giác:");
           int side3=Integer.parseInt(scanner.nextLine());
           if (side1 <0||side2<0||side3<0 || ((side1+side3)<side2 || (side1+side2)<side3 || (side2+side3)<side1)){
               throw new IllegalTriangleException("Không phải tam giác");
           }
       }catch (NumberFormatException e){
           System.out.println("Không phải tam giác");
       }
       catch (IllegalTriangleException e) {
           System.out.println(e.getMessage());
       }


    }
}
