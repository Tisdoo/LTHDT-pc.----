class Thuchanh extends Monhoc {
    private double[] diemKT = new double[4];

    public Thuchanh(String ma, String ten, int soTC, double[] diem) {
        super(ma, ten, soTC);
        this.diemKT = diem;
    }

    @Override
    public double tinhDTB() {
        double sum = 0;
        for (double d : diemKT)
            sum += d;
        return sum / 4;

    }
}
