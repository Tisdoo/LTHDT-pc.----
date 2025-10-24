public class Main {
    public static void main(String[] args) {

        System.out.println("--- BÁO CÁO TÍNH TIỀN NƯỚC CHUNG CƯ XYZ (3 HỘ RIÊNG LẺ) ---");

        HoGiaDinh hoA = new HoLoaiA("Nguyễn Văn A", "C101", 500, 560, 4);

        HoGiaDinh hoB = new HoLoaiB("Trần Thị B", "D202", 300, 345);

      
        HoGiaDinh hoC = new HoLoaiC("Lê Văn C", "A303", 100, 120, 1);

        System.out.println("\n--- THÔNG TIN CHI TIẾT ---");

       
        hoA.inThongTin();

        hoB.inThongTin();

        hoC.inThongTin();

    }
}