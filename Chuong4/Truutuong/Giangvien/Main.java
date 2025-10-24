public class Main {
    public static void main(String[] args) {

        GiangVien gv1 = new GiangVien("Nguyễn Văn A", "12/12/1980",
                "nam", "GV001", 1500000, 3.0, "trưởng khoa");
        GiangVien gv2 = new GiangVien(
                "Trần Thị B", "05/05/1985", "nữ",
                "GV002", 1500000, 2.34, "giảng viên");

        gv1.xuatThongTin();

        System.out.println("-----------------------------");
       
        gv2.xuatThongTin();
    }
}
