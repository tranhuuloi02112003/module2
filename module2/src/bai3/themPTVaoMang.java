package bai3;

import java.util.Scanner;

public class themPTVaoMang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] ={1,2,3,5};
        int arr1[]= new int[arr.length+1];
        int x,index;
        System.out.print("Nhập VT cần chèn:");
        index= sc.nextInt();
        System.out.print("Nhập GT cần chèn:");
        x= sc.nextInt();
        for (int i = arr1.length-1; i >=0; i--) {
                if (i==index){
                    arr1[i]=x;
                }else {
                    arr1[i]=arr[i];
                }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+" ");
        }
    }
}
