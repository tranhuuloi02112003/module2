package bai1;

public class tesst {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(check());
    }

    static int check() {
        int num = 0;
        for (int i = 9; i <= 12; i++) {
            if (i < 10) {
                num += 1;
            } else {
                int firstNumb = i;
                int lastNumb = i % 10;
                while (firstNumb >= 10) firstNumb /= 10;
                if (firstNumb == lastNumb) {
                    num += 1;
                }
            }
        }
        return num;
    }

}



