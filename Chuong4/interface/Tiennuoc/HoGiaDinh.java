public abstract class HoGiaDinh {
   
    public String tenChuHo;
    public String diaChi;
    public double chiSoNuocCu;
    public double chiSoNuocMoi;

  
    public double soNuocTieuThu;

    public HoGiaDinh(String tenChuHo, String diaChi, double chiSoNuocCu, double chiSoNuocMoi) {
        this.tenChuHo = tenChuHo;
        this.diaChi = diaChi;
        this.chiSoNuocCu = chiSoNuocCu;
        this.chiSoNuocMoi = chiSoNuocMoi;
        this.soNuocTieuThu = chiSoNuocMoi - chiSoNuocCu; 
    }


    public abstract double tinhSoNuocPhaiTra();

    
    public double tinhTienNuoc() {
        return tinhSoNuocPhaiTra() * 8000;
    }

    public void inThongTin() {
        System.out.printf("--- Hộ: %s (%s) ---\n", tenChuHo, diaChi);
        System.out.printf("  Tiêu thụ cơ bản: %.0f khối\n", soNuocTieuThu); 
        System.out.printf("  Số nước tính tiền: %.0f khối\n", tinhSoNuocPhaiTra());
        System.out.printf("  Tiền nước phải trả: %,.0f VND\n", tinhTienNuoc());
    }
}