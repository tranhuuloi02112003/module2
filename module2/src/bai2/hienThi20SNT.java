package bai2;

public class hienThi20SNT {
    public static void main(String[] args) {
        int count=0;
        int i=2;
        while (count!=20){
            if (kiemTraSNT(i)){
                System.out.println(i+" ");
                count++;
            }
            i++;
        }
    }
    public static boolean kiemTraSNT(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%2==0){
                return false;
            }
        }
        return true;
    }
}
