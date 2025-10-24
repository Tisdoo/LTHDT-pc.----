public class HoLoaiC extends HoGiaDinh {
   
        private int soNhanKhauPhucVu;
    
        public HoLoaiC(String tenChuHo, String diaChi, double chiSoNuocCu, double chiSoNuocMoi, int soNhanKhauPhucVu) {
            super(tenChuHo, diaChi, chiSoNuocCu, chiSoNuocMoi);
            this.soNhanKhauPhucVu = soNhanKhauPhucVu;
        }
    
        @Override
        public double tinhSoNuocPhaiTra() {
            // Truy cập trực tiếp soNuocTieuThu (thuộc tính public)
            double giamGia = 10 * soNhanKhauPhucVu;
            double soNuoc = soNuocTieuThu - giamGia;
            return Math.max(0, soNuoc);
        }
    }
