class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;

    // Constructor mặc định
    public Nguoi() {
        this.hoTen = "";
        this.ngaySinh = "";
        this.gioiTinh = "nam"; // mặc định là nam
    }

    // Constructor có tham số
    public Nguoi(String hoTen, String ngaySinh, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;

        // kiểm tra giới tính hợp lệ
        if (gioiTinh.equalsIgnoreCase("nam") || gioiTinh.equalsIgnoreCase("nữ")) {
            this.gioiTinh = gioiTinh.toLowerCase();
        } else {
            this.gioiTinh = "nam";
        }
    }

    public void xuatThongTin(){

        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
    }
}