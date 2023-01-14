package bai11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang_Stack {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
//        System.out.print("Nhập số lượng pt trong mảng:");
//        int size= scanner.nextInt();
//        int arr[]= new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i]=scanner.nextInt();
//            integerStack.push(arr[i]);
//        }
//        System.out.println("Mảng trước khi đảo ngược");
//        System.out.println(integerStack.toString());
//        for (int i = 0; i < size; i++) {
//            arr[i]=integerStack.pop();
//        }
//
//        System.out.println("Mảng sau khi đảo ngược");
//        System.out.println(Arrays.toString(arr));

        Stack<String> wStack  = new Stack<>();
        System.out.print("Nhập chuỗi:");
        String str=scanner.nextLine();
        String arrString[]=str.split(" ");
        System.out.println("Mảng trước khi đảo ngược");
        System.out.println(Arrays.toString(arrString));
        for (int i = 0; i < arrString.length; i++) {
            wStack.push(arrString[i]);
        }

        for (int i = 0; i < wStack.size(); i++) {
            str += wStack.pop()+ " ";
        }
        System.out.println("Mảng sau khi đảo ngược");
        System.out.println(str);


    }
}
