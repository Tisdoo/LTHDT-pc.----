package Tinhluong;

public class NhanvienSX extends Nhanvien {
private int snn;
    public static double hsPhuCapNangNhoc = 0.1;

    public NhanvienSX(String ma, String ten, int nvl, double hsl,int snn) {
super(ma, ten, nvl, hsl);
this.snn=snn;

    }

    @Override
    public char Xeploai() {
      
        if (snn <= 1)
            return 'A';
        else if (snn <= 3)
            return 'B';
        else if (snn <= 5)
            return 'C';
        else
            return 'D';

    }
    @Override
    public double tinhluong(){

        return hsl*luongcoban*(1+hsPhuCapNangNhoc);
    }



}
