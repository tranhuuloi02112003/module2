package bai14;

public class CaiDatThuatToanSXChen {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j]<list[j-1]){
                    int temp=list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }
}
