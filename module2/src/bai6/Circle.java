package bai6;

public class Circle {
    protected static final double PI = 3.14;
    private float banKinh;
    private String mauSac;

    public Circle() {
    }

    public Circle(float banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSat() {
        return mauSac;
    }

    public void setMauSat(String mauSat) {
        this.mauSac = mauSat;
    }

    public double dienTich() {
        return PI * banKinh * banKinh;
    }


    public String toString() {
        return "Bán kính:" + banKinh + " Màu sắc:" + mauSac+" Diện tích:"+dienTich();
    }
}

class Cylinder extends Circle {
    private double chieuCao;

    public Cylinder() {
    }

    public Cylinder(float banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double theTich() {
        return super.dienTich() * chieuCao;
    }

    @Override
    public String toString() {
        return  "Bán kính:" + getBanKinh() + " Màu sắc:" + getMauSat()+ " Chiều cao:" + chieuCao+" Thể tích:"+theTich();
    }

    public static void main(String[] args) {
        Circle circle= new Circle(2,"red");
        System.out.println(circle.toString());
        Cylinder cylinder= new Cylinder(3,"blu",4);
        System.out.println(cylinder.toString());
    }

}
