package bai2;

import javax.imageio.ImageTranscoder;

public class hienThiCacSNTNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            if (kiemTraSNT(i)){
                System.out.println(i+" ");
            }
        }

    }
    public static boolean kiemTraSNT(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}
