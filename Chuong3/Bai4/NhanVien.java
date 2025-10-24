package Bai4;

public class NhanVien {

    protected String maNhanVien;
    protected String tenNhanVien;
    protected double heSoLuong;


    public static final double LUONG_CO_BAN = 1150.0;


    public NhanVien() {
        this.maNhanVien = "NV001";
        this.tenNhanVien = "Họ tên sinh viên"; 
        this.heSoLuong = 2.34;
    }


    public NhanVien(String maNV, String tenNV, double heSo) {
        // Kiểm tra 2 ký tự đầu của mã nhân viên phải là "NV" (Không phân biệt chữ hoa/thường)
        if (maNV != null && maNV.length() >= 2 && maNV.substring(0, 2).toUpperCase().equals("NV")) {
            this.maNhanVien = maNV;
        } else {
            // Nếu không phù hợp thì mặc định là "NV001"
            this.maNhanVien = "NV001";
        }
        
        this.tenNhanVien = tenNV;
        this.heSoLuong = heSo;
    }

   
    public double tinhThuNhap() {
        return this.heSoLuong * LUONG_CO_BAN;
    }


    public void xuat() {
        System.out.println("--- THÔNG TIN NHÂN VIÊN ---");
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.printf("Thu nhập: %.2f VNĐ\n", tinhThuNhap()); 
    }
}
