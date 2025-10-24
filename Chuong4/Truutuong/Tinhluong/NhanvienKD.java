package Tinhluong;

public class NhanvienKD extends NhanvienSX {
    private double dstt;
    private double ds;

    public NhanvienKD(String ma, String ten, int nvl, double hsl,double dstt,double ds) {
        super(ma, ten, nvl, hsl, nvl);

        this.ds = ds;
        this.dstt = dstt;
    }

    public char Xeploai() {
        if (ds == dstt)
            return 'B';
        if (ds < dstt && ds >= dstt * 0.5)
            return 'C';
        if (ds < dstt * 0.5)
            return 'D';
        else
            return 'A';
    }

    public double tinhluong() {
        if (ds > dstt)
            return hsl * luongcoban + 0.15 * (ds - dstt);
        else
            return hsl * luongcoban;
    }
}