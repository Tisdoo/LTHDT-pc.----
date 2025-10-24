public class Doan extends Monhoc {
    private double diemGVHD, diemGVPB;

    public Doan(String ma, String ten, int soTc, double hd, double pb) {
        super(ma, ten, soTc);
        this.diemGVHD = hd;
        this.diemGVPB = pb;

    }

    @Override
    public double tinhDTB() {
        return (diemGVHD + diemGVPB) / 2;

    }
}