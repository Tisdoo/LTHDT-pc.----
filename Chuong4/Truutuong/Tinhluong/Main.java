package Tinhluong;

public class Main {
    public static void main(String[] args) {
        Nhanvien kd= new NhanvienKD("A002", "Sang", 2008, 1.0, 200000000, 21000000);
        Nhanvien sx = new NhanvienSX("A001", "Phuoc", 2020, 1.0,5);
      Nhanvien cb= new Canboql("A003", "Hay", 2000, 1.0, "laocong", 3.0);
kd.hienthi();
sx.hienthi();
cb.hienthi();
    
    }
}
