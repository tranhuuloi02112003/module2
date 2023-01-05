package casestudy;

public class Employee {
    private String maNhanVien,hoTen,gioiTinh,Emai,soDienThoai,soCMND;
    private double luong;

    enum viTri{
        LeTan,PhucVu,ChuyenVien,GiamSat,QuanLy,GiamDoc
    }
    enum trinhDo {
        TrungCap,CaoDang,DaiHoc,SauDaiHoc
    }




}
//Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
//Trình độ sẽ lưu trữ các thông tin: Trung cấp, Cao đẳng, Đại học và sau đại học
//Vị trí sẽ lưu trữ các thông tin: Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.