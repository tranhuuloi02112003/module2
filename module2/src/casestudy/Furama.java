package casestudy;

public abstract class Furama {
    private String tenDichVu;
    private double dienTichSuDung,chiPhiThue;
    private int soLuongNguoiToiDa;
   enum kieuThue{
       nam,thang,ngay,gio
   }
}
//Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa,
// Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.)