package bai11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoTu_Map {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì: ");
        String string = sc.nextLine().toLowerCase();

        String[] newString = string.split(" ");
        //Kiểm tra xem trong map có key này hay chưa. Nếu có đẩy key này vào map và tăng value
        // (số lượng từ) lên 1 Nếu key này chưa có trong map thì đẩy key vào map mặc định gán value là 1.
        System.out.println(Arrays.toString(newString));
//        int count = 1;

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < newString.length; i++) {
            if (treeMap.containsKey(newString[i])) {
                treeMap.put(newString[i], treeMap.get(newString[i]) + 1);
            } else {
                treeMap.put(newString[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}
