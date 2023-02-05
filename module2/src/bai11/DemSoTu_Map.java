package bai11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoTu_Map {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì: ");
        String string = sc.nextLine().toLowerCase();

        String[] newArrString = string.split(" ");
        //Kiểm tra xem trong map có key này hay chưa. Nếu có đẩy key này vào map và tăng value
        // (số lượng từ) lên 1 Nếu key này chưa có trong map thì đẩy key vào map mặc định gán value là 1.
        System.out.println(Arrays.toString(newArrString));
//        int count = 1;

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < newArrString.length; i++) {
            if (treeMap.containsKey(newArrString[i])) {
                treeMap.put(newArrString[i], treeMap.get(newArrString[i]) + 1);
            } else {
                treeMap.put(newArrString[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}
