

abstract class Monhoc {
    protected String maMH;
    protected String tenMH;
    protected int soTC;

    // Constructor
    public Monhoc(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;

    }

    // Phương thức trừu tượng
    public abstract double tinhDTB();

    public String diemChu() {
        double dtb = tinhDTB();
        if (dtb >= 8.5)
            return "A";

        else if (dtb >= 7.0)
            return "B";

        else if (dtb >= 5.5)
            return "C";
        else if (dtb >= 4.0)
            return "D";
        else
            return "F";
    }

    public void hienThi() {
        System.out.println(maMH + " - " + tenMH + " (" + soTC + " tín chỉ)");
        System.out.println("Điểm TB: " + tinhDTB());
        System.out.println("Điểm chữ: " + diemChu());
        System.out.println("---------------------------");
    }
    
}
