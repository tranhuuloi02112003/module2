package bai17;

public class Prodoct  {
    private String ma,ten,hang;
    private double gia;

    public Prodoct() {
    }

    public Prodoct(String ma, String ten, String hang, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Prodoct{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", hang='" + hang + '\'' +
                ", gia=" + gia +
                '}';
    }
}
