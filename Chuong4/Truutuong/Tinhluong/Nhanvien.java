package Tinhluong;

import java.time.LocalDate;

abstract class Nhanvien {
    String ma;
    String ten;

    abstract public char Xeploai();

    abstract public double tinhluong();

    int nvl;
    double hsl;

    public Nhanvien(String ma, String ten, int nvl, double hsl) {
        this.ma = ma;
        this.ten = ten;
        this.nvl = nvl;

        this.hsl = hsl;

    }

    protected static double luongcoban = 1150;

    public double phucapthamnien() {
        int tn = LocalDate.now().getYear() - nvl;
        if (tn >= 5)
            return tn * Nhanvien.luongcoban / 100;
        return 0;
    }

    public double thunhap() {
        char xl = Xeploai();
        double hsThidua = 0;
        if (xl == 'A')
            hsThidua = 1.0;
        if (xl == 'B')
            hsThidua = 0.75;
        if (xl == 'C')
            hsThidua = 0.5;
        if (xl == 'D')
            hsThidua = 0.0;
        return hsThidua * tinhluong() + phucapthamnien();
    }

    public void hienthi() {
        System.out.println("tên" + ten);
        System.out.println("thunhap " + thunhap());
        System.out.println(" --------------------------------------- ");
    }
}
