public class HoLoaiB extends HoGiaDinh {
    public HoLoaiB(String tenChuHo, String diaChi, double chiSoNuocCu, double chiSoNuocMoi) {
        super(tenChuHo, diaChi, chiSoNuocCu, chiSoNuocMoi);
    }

    @Override
    public double tinhSoNuocPhaiTra() {
        // Truy cập trực tiếp soNuocTieuThu (thuộc tính public)
        double soNuoc = soNuocTieuThu - 20;
        return Math.max(0, soNuoc);
    }
}