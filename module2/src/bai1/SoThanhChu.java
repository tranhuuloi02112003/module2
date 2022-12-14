package bai1;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbber;
        do {
            System.out.println("Nhập 1 số nguyên");
            numbber = Integer.parseInt(sc.nextLine());
        } while (numbber > 999 && numbber < 0);
        //123
        String tram = "";
        String chuc = "";
        String donVi = "";
        int temp = numbber;
        int hangtram = temp / 100;
        temp %= 100;
        int hangchuc = temp / 10;
        int hangdonvi = temp % 10;

        switch (hangtram) {
            case 1:
                tram = "One hundred";
                break;
            case 2:
                tram = "Two hundred";
                break;
            case 3:
                tram = "Three hundred";
                break;
            case 4:
                tram = "Four hundred";
                break;
            case 5:
                tram = "Five hundred";
                break;
            case 6:
                tram = "Six hundred";
                break;
            case 7:
                tram = "Seven hundred";
                break;
            case 8:
                tram = "Eight hundred";
                break;
            case 9:
                tram = "Nine hundred";
                break;
        }
        if (hangchuc == 1) {
            switch (hangdonvi) {
                case 0:
                    chuc="ten";
                    break;
                case 1:
                    chuc = "Eleven";
                    break;
                case 2:
                    chuc = "Twelve";
                    break;
                case 3:
                    chuc = "thirteen";
                    break;
                case 4:
                    chuc = "fourteen";
                    break;
                case 5:
                    chuc = "fifteen";
                    break;
                case 6:
                    chuc = "sixteen";
                    break;
                case 7:
                    chuc = "seventeen";
                    break;
                case 8:
                    chuc = "eighteen";
                    break;
                case 9:
                    chuc = "nineteen";
                    break;
            }
        } else {
            switch (hangchuc) {
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "forty";
                    break;
                case 5:
                    chuc = "fifty";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;
            }
        }

        switch (hangdonvi) {
            case 0:
                donVi="zero";
                break;
            case 1:
                donVi = "one";
                break;
            case 2:
                donVi = "two";
                break;
            case 3:
                donVi = "three";
                break;
            case 4:
                donVi = "four";
                break;
            case 5:
                donVi = "five";
                break;
            case 6:
                donVi = "six";
                break;
            case 7:
                donVi = "seven";
                break;
            case 8:
                donVi = "eight";
                break;
            case 9:
                donVi = "nine";
                break;
        }
        if (hangtram==0 && hangchuc==0){
            System.out.println(donVi);
        }else if (hangtram==0 && hangdonvi==0){
            System.out.println(chuc);
        }else if (hangtram==0 && hangchuc!=1){
            System.out.println(chuc+" "+donVi);
        }else if (hangtram==0 && hangchuc==1){
            System.out.println(chuc);
        }else if(hangdonvi==0||hangchuc==1){
            System.out.println(tram+" and "+chuc);
        } else if (hangchuc!=1) {
            System.out.println(tram+" and "+chuc+" "+donVi);
        }

    }
}
