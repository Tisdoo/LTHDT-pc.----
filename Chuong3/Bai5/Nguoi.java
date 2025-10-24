package Bai5;

public class Nguoi {

    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;

  
    public Nguoi() {
        this.hoTen = "Chưa rõ";
        this.ngaySinh = "01/01/2000";
        this.gioiTinh = "nam"; 
    }

    
    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        
        // Kiểm tra tham số giới tính truyền vào
        String gt = gioiTinh.toLowerCase();
        if (gt.equals("nam") || gt.equals("nữ")) {
            this.gioiTinh = gt;
        } else {
        
            this.gioiTinh = "nam";
        }
    }

   
    public void xuat() {
        System.out.println(" Họ tên: " + hoTen);
        System.out.println( "Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }
}
