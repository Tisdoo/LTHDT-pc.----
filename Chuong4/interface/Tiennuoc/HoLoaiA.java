public class HoLoaiA extends HoGiaDinh {
    private int soNhanKhau;

    public HoLoaiA(String tenChuHo, String diaChi, double chiSoNuocCu, double chiSoNuocMoi, int soNhanKhau) {
        super(tenChuHo, diaChi, chiSoNuocCu, chiSoNuocMoi);
        this.soNhanKhau = soNhanKhau;
    }

    @Override
    public double tinhSoNuocPhaiTra() {
        // Truy cập trực tiếp soNuocTieuThu (thuộc tính public)
        double giamGia = 5 * soNhanKhau;
        double soNuoc = soNuocTieuThu - giamGia;
        return Math.max(0, soNuoc);
    }
}