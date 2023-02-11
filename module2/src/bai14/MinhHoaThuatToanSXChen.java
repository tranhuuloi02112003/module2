package bai14;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToanSXChen {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số lượng pt trong mảng");
        int size=Integer.parseInt(scanner.nextLine());
        int arr[]= new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Pt thứ "+(i+1)+":");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng hiện tại:");
        System.out.println(Arrays.toString(arr));
        sapXepChen(arr);
        System.out.println("Mảng sau khi sx chèn:");
        System.out.println(Arrays.toString(arr));

    }
    public static void sapXepChen(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }
}
